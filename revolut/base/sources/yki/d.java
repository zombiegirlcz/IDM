package yki;

import java.util.Iterator;
import java.util.ListIterator;
import kel.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import o97.y;
import zhm.b0;
import zhm.w0;
import zkh.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d extends q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        com.revolut.kompot.navigable.a aVar;
        com.revolut.kompot.navigable.a aVar2;
        switch (this.f) {
            case 0:
                com.revolut.kompot.navigable.a p0 = (com.revolut.kompot.navigable.a) obj2;
                com.revolut.kompot.navigable.b p17 = (com.revolut.kompot.navigable.b) obj3;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                e eVar = (e) this.receiver;
                eVar.getClass();
                if (!p0.x2() && p17.f98422h && ((aVar = p17.k) == null || Intrinsics.f(aVar, p0))) {
                    Iterator it8 = ((aim.e) eVar.e.getAll()).iterator();
                    while (true) {
                        aim.b bVar = (aim.b) it8;
                        if (bVar.hasNext()) {
                            com.revolut.kompot.navigable.b bVar2 = (com.revolut.kompot.navigable.b) bVar.next();
                            if (!Intrinsics.f(bVar2, p17) && bVar2.k != null) {
                                bVar2.e();
                            }
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                com.revolut.kompot.navigable.a p03 = (com.revolut.kompot.navigable.a) obj2;
                com.revolut.kompot.navigable.b p110 = (com.revolut.kompot.navigable.b) obj3;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p110, "p1");
                e eVar2 = (e) this.receiver;
                eVar2.getClass();
                if (!p03.x2() && p110.f98422h && ((aVar2 = p110.k) == null || aVar2.equals(p03))) {
                    Iterator it9 = b0.L(eVar2.e.getAll()).iterator();
                    while (true) {
                        ListIterator listIterator = ((w0) it9).f322483a;
                        if (listIterator.hasPrevious()) {
                            com.revolut.kompot.navigable.b bVar3 = (com.revolut.kompot.navigable.b) listIterator.previous();
                            com.revolut.kompot.navigable.a aVar3 = bVar3.k;
                            if (!bVar3.equals(p110) && aVar3 != null) {
                                if (p110.f98424l) {
                                    bVar3.c();
                                }
                                if (!bVar3.f98422h || aVar3.x2()) {
                                }
                            }
                        }
                    }
                }
                return Unit.f186387a;
            case 2:
                xx4.b p010 = (xx4.b) obj2;
                os7.a p111 = (os7.a) obj3;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(p111, "p1");
                ((xx4.d) this.receiver).b(p010, p111);
                return Unit.f186387a;
            default:
                n p011 = (n) obj2;
                String p112 = (String) obj3;
                Intrinsics.checkNotNullParameter(p011, "p0");
                Intrinsics.checkNotNullParameter(p112, "p1");
                return new zkh.i(new y(((v) this.receiver).f323040g, new zkh.e(p011), "details", 56), p011.e, p011.f183178j, p112);
        }
    }
}
