package br4;

import bq5.o0;
import dx4.e1;
import dx4.g2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 implements cli.n {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr4.d f17912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr4.e f17913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fr4.g f17914c;
    public final rm4.c d;
    public final fr4.b e;
    public final fr4.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mx4.x f17915g;

    public m0(fr4.d limitsSectionMapper, fr4.e promotionalSectionMapper, fr4.g ratesSectionMapper, rm4.c cardsSectionMapper, fr4.b documentSectionMapper, er4.k creditCardShopWithMsiSectionMapper, fr4.h toolbarModelMapper, mx4.x contentListItemMapper, er4.a cancellationButtonMapper) {
        Intrinsics.checkNotNullParameter(limitsSectionMapper, "limitsSectionMapper");
        Intrinsics.checkNotNullParameter(promotionalSectionMapper, "promotionalSectionMapper");
        Intrinsics.checkNotNullParameter(ratesSectionMapper, "ratesSectionMapper");
        Intrinsics.checkNotNullParameter(cardsSectionMapper, "cardsSectionMapper");
        Intrinsics.checkNotNullParameter(documentSectionMapper, "documentSectionMapper");
        Intrinsics.checkNotNullParameter(creditCardShopWithMsiSectionMapper, "creditCardShopWithMsiSectionMapper");
        Intrinsics.checkNotNullParameter(toolbarModelMapper, "toolbarModelMapper");
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        Intrinsics.checkNotNullParameter(cancellationButtonMapper, "cancellationButtonMapper");
        this.f17912a = limitsSectionMapper;
        this.f17913b = promotionalSectionMapper;
        this.f17914c = ratesSectionMapper;
        this.d = cardsSectionMapper;
        this.e = documentSectionMapper;
        this.f = toolbarModelMapper;
        this.f17915g = contentListItemMapper;
    }

    public static boolean a(List list) {
        Object next;
        Iterator it8 = list.iterator();
        loop0: while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            e1 e1Var = (e1) next;
            if (Intrinsics.f(d9.e1.p(e1Var), "promotional_period")) {
                break;
            }
            if (e1Var instanceof g2) {
                List list2 = ((g2) e1Var).d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        if (a(zhm.u.c((e1) it9.next()))) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return next != null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (z) iii.c.f(domainState.f17911a, new o0(18), new bn4.y(this, 14), new b88.o(this, 14));
    }
}
