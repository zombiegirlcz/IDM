package androidx.compose.runtime.tooling;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTrace;", "", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "frames", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getFrames", "()Ljava/util/List;", "", "getHasSourceInformation", "()Z", "getHasSourceInformation$annotations", "()V", "hasSourceInformation", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeStackTrace {

    @NotNull
    private final List<ComposeStackTraceFrame> frames;

    public ComposeStackTrace(@NotNull List<ComposeStackTraceFrame> list) {
        this.frames = list;
    }

    @NotNull
    public final List<ComposeStackTraceFrame> getFrames() {
        return this.frames;
    }

    public final boolean getHasSourceInformation() {
        List<ComposeStackTraceFrame> list = this.frames;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getSourceInfo() != null) {
                return true;
            }
        }
        return false;
    }
}
