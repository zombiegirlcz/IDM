package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GroupSourceInformation;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u000eH\u0002J,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0001H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH&R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceBuilder;", "", "<init>", "()V", "_trace", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "trace", "", "appendTraceFrame", "", "groupKey", "", "groupSourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "child", "extractTraceFrame", "targetChild", "sourceInformationOf", "group", "isCall", "", "processEdge", "objectKey", "sourceInformation", "childData", "appendGroupSourceInformation", "target", "anchor", "Landroidx/compose/runtime/Anchor;", "groupKeyOf", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ComposeStackTraceBuilder {

    @NotNull
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    private final boolean appendGroupSourceInformation(int groupKey, GroupSourceInformation sourceInformation, Object target) {
        ArrayList<Object> groups = sourceInformation.getGroups();
        boolean z = false;
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = groups.get(i);
                if (obj2 instanceof Anchor) {
                    if (obj2.equals(target)) {
                        appendTraceFrame(sourceInformation.getKey(), sourceInformation, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof GroupSourceInformation)) {
                        throw new IllegalStateException(a.l(obj2, "Unexpected child source info "));
                    }
                    if (appendGroupSourceInformation(groupKey, (GroupSourceInformation) obj2, target)) {
                        appendTraceFrame(sourceInformation.getKey(), sourceInformation, obj2);
                        return true;
                    }
                }
            }
            return false;
        }
        if (!sourceInformation.getClosed()) {
            appendTraceFrame(groupKey, sourceInformation, null);
            return true;
        }
        int dataStartOffset = sourceInformation.getDataStartOffset();
        int dataEndOffset = sourceInformation.getDataEndOffset();
        if (target instanceof Integer) {
            Number number = (Number) target;
            int iIntValue = number.intValue();
            if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                z = true;
            }
            if (z) {
                appendTraceFrame(sourceInformation.getKey(), sourceInformation, null);
            }
        }
        return z;
    }

    private final void appendTraceFrame(int groupKey, GroupSourceInformation groupSourceInformation, Object child) {
        ComposeStackTraceFrame composeStackTraceFrameExtractTraceFrame = extractTraceFrame(groupKey, groupSourceInformation, child);
        if (composeStackTraceFrameExtractTraceFrame != null) {
            this._trace.add(composeStackTraceFrameExtractTraceFrame);
        }
    }

    private final ComposeStackTraceFrame extractTraceFrame(int groupKey, GroupSourceInformation groupSourceInformation, Object targetChild) {
        return new ComposeStackTraceFrame(groupKey, null, null);
    }

    private final boolean isCall(GroupSourceInformation groupSourceInformation) {
        String sourceInformation = groupSourceInformation.getSourceInformation();
        return sourceInformation != null && a0.H(sourceInformation, "C", false);
    }

    private final GroupSourceInformation sourceInformationOf(Object group) {
        if (group instanceof Anchor) {
            return sourceInformationOf((Anchor) group);
        }
        if (group instanceof GroupSourceInformation) {
            return (GroupSourceInformation) group;
        }
        throw new IllegalStateException(a.l(group, "Unexpected child source info "));
    }

    public abstract int groupKeyOf(@NotNull Anchor anchor);

    public final void processEdge(int groupKey, Object objectKey, GroupSourceInformation sourceInformation, Object childData) {
        if (Intrinsics.f(objectKey, Composer.INSTANCE.getEmpty())) {
            appendTraceFrame(groupKey, sourceInformation, null);
        }
    }

    public abstract GroupSourceInformation sourceInformationOf(@NotNull Anchor anchor);

    @NotNull
    public final List<ComposeStackTraceFrame> trace() {
        return this._trace;
    }
}
