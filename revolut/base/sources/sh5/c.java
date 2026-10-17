package sh5;

import com.revolut.core.ui_kit.models.Clause;
import koi.j;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f263435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f263436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f263437c;
    public final Lazy d;
    public final Lazy e;

    public c(Clause clause, j jVar) {
        this.f263435a = clause;
        this.f263436b = jVar;
        this.f263437c = jVar != null;
        final int i = 0;
        this.d = yhm.j.b(new Function0(this) { // from class: sh5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f263434b;

            {
                this.f263434b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Clause clause2 = this.f263434b.f263435a;
                        if (clause2 != null) {
                            return clause2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    default:
                        j jVar2 = this.f263434b.f263436b;
                        if (jVar2 != null) {
                            return jVar2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: sh5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f263434b;

            {
                this.f263434b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Clause clause2 = this.f263434b.f263435a;
                        if (clause2 != null) {
                            return clause2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    default:
                        j jVar2 = this.f263434b.f263436b;
                        if (jVar2 != null) {
                            return jVar2;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f263435a, cVar.f263435a) && Intrinsics.f(this.f263436b, cVar.f263436b);
    }

    public final int hashCode() {
        Clause clause = this.f263435a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        j jVar = this.f263436b;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }
}
