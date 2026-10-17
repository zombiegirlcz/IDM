package androidx.content;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateWriter;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u001e\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/ActionOnlyNavDirections;", "Landroidx/navigation/NavDirections;", "", "actionId", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getActionId", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;

    @NotNull
    private final Bundle arguments;

    public ActionOnlyNavDirections(int i) {
        this.actionId = i;
        r0.g();
        Pair[] pairArr = new Pair[0];
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        this.arguments = bundleBundleOf;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && ActionOnlyNavDirections.class.equals(other.getClass()) && getActionId() == ((ActionOnlyNavDirections) other).getActionId();
    }

    @Override // androidx.content.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.content.NavDirections
    @NotNull
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return getActionId() + 31;
    }

    @NotNull
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
