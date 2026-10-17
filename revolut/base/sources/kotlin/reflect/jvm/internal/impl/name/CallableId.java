package kotlin.reflect.jvm.internal.impl.name;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CallableId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f187458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Name f187459b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        FqName.Companion.topLevel(SpecialNames.LOCAL);
    }

    public CallableId(@NotNull FqName packageName, @NotNull Name callableName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f187458a = packageName;
        this.f187459b = callableName;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj2;
        return Intrinsics.f(this.f187458a, callableId.f187458a) && Intrinsics.f(this.f187459b, callableId.f187459b);
    }

    public int hashCode() {
        return this.f187459b.hashCode() + ((this.f187458a.hashCode() + 527) * 961);
    }

    @NotNull
    public String toString() {
        return a0.E(this.f187458a.asString(), CoreConstants.DOT, '/') + "/" + this.f187459b;
    }
}
