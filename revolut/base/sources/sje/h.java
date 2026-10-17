package sje;

import bje.k;
import bje.l;
import bje.m;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s6e.v;
import w4l.i;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements mf1.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yud.g f263718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f263719c;

    public h(String productName, String itemId, yud.g stakingInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f263717a = itemId;
        this.f263718b = stakingInteractor;
        this.f263719c = productName;
    }

    @Override // mf1.a
    public final Flow a() {
        for (qf1.f fVar : qf1.f.a()) {
            String id10 = fVar.getId();
            String str = this.f263717a;
            if (Intrinsics.f(id10, str)) {
                int i = f.f263715a[fVar.ordinal()];
                if (i == 1) {
                    return new go.g(new bje.c(str, m.INSTANCE), 2);
                }
                Continuation continuation = null;
                if (i != 2) {
                    return i != 3 ? i != 4 ? new go.g(null, 2) : new go.g(new bje.c(str, k.INSTANCE), 2) : new go.g(new bje.c(str, l.INSTANCE), 2);
                }
                return rd0.e.e(new v(mo3.a.g(this.f263718b.e(i.f294643c), null, null, 3), this, 8), h0.f322473a, new pti.d(this, continuation, 22));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // mf1.a
    public final String b() {
        return this.f263719c;
    }
}
