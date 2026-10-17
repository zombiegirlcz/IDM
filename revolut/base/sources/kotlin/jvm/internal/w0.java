package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/w0;", "Lwim/r;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 implements wim.r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wim.t f186439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile List f186440c;

    /* JADX INFO: renamed from: kotlin.jvm.internal.w0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/w0$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static String a(wim.r typeParameter) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb6 = new StringBuilder();
            int i = v0.f186437a[typeParameter.getF186439b().ordinal()];
            if (i == 1) {
                Unit unit = Unit.f186387a;
            } else if (i == 2) {
                sb6.append("in ");
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb6.append("out ");
            }
            sb6.append(typeParameter.getName());
            return sb6.toString();
        }
    }

    public w0(Object obj2, wim.t variance) {
        Intrinsics.checkNotNullParameter("PluginConfigT", "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.f186438a = obj2;
        this.f186439b = variance;
    }

    public final void a(List upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.f186440c == null) {
            this.f186440c = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof w0) {
            return Intrinsics.f(this.f186438a, ((w0) obj2).f186438a);
        }
        return false;
    }

    @Override // wim.r
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // wim.r
    public final List getUpperBounds() {
        List list = this.f186440c;
        if (list != null) {
            return list;
        }
        List listC = zhm.u.c(o0.a(Object.class));
        this.f186440c = listC;
        return listC;
    }

    @Override // wim.r
    /* JADX INFO: renamed from: getVariance, reason: from getter */
    public final wim.t getF186439b() {
        return this.f186439b;
    }

    public final int hashCode() {
        Object obj2 = this.f186438a;
        return ((obj2 != null ? obj2.hashCode() : 0) * 31) + 749883007;
    }

    public final String toString() {
        INSTANCE.getClass();
        return Companion.a(this);
    }
}
