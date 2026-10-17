package androidx.glance.action;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/glance/action/LambdaAction;", "Landroidx/glance/action/Action;", "key", "", "block", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getBlock", "()Lkotlin/jvm/functions/Function0;", "getKey", "()Ljava/lang/String;", "toString", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LambdaAction implements Action {

    @NotNull
    private final Function0<Unit> block;

    @NotNull
    private final String key;

    public LambdaAction(@NotNull String str, @NotNull Function0<Unit> function0) {
        this.key = str;
        this.block = function0;
    }

    @NotNull
    public final Function0<Unit> getBlock() {
        return this.block;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public String toString() {
        return "LambdaAction(" + this.key + ", " + this.block.hashCode() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
