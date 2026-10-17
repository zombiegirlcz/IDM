package androidx.glance.action;

import androidx.glance.action.ActionParameters;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\b\u001a\u00020\u00072\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Landroidx/glance/action/ActionParameters$Pair;", "", "pairs", "Landroidx/glance/action/ActionParameters;", "actionParametersOf", "([Landroidx/glance/action/ActionParameters$Pair;)Landroidx/glance/action/ActionParameters;", "Landroidx/glance/action/MutableActionParameters;", "mutableActionParametersOf", "([Landroidx/glance/action/ActionParameters$Pair;)Landroidx/glance/action/MutableActionParameters;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ActionParametersKt {
    @NotNull
    public static final ActionParameters actionParametersOf(@NotNull ActionParameters.Pair<? extends Object>... pairArr) {
        return mutableActionParametersOf((ActionParameters.Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @NotNull
    public static final MutableActionParameters mutableActionParametersOf(@NotNull ActionParameters.Pair<? extends Object>... pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        if (pairArr.length <= 0) {
            Pair[] pairArr2 = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MutableActionParameters(r0.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        }
        ActionParameters.Pair<? extends Object> pair = pairArr[0];
        throw null;
    }
}
