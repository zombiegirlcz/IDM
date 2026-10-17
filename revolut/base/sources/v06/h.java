package v06;

import com.revolut.retail.core.navigation.FinishCommand;
import dcf.v0;
import efm.d0;
import grl.za;
import hx7.l;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n14.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r10.r;
import s06.o;
import skm.e0;
import ufm.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f284760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f284761c;

    public /* synthetic */ h(j jVar, String str, int i) {
        this.f284759a = i;
        this.f284760b = jVar;
        this.f284761c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String str;
        d0 d0VarM;
        int i = this.f284759a;
        String str2 = this.f284761c;
        j jVar = this.f284760b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return jVar.N(str2, jVar.f284769p.f284757b);
            default:
                Boolean handled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(handled, "handled");
                if (handled.booleanValue()) {
                    return m.f279897a;
                }
                d dVar = jVar.f284769p;
                String str3 = dVar.f284757b;
                Integer num = dVar.d;
                int i2 = 0;
                if (str2 != null && kotlin.collections.d.I(new String[]{"android.intent.action.VIEW", "com.revolut.navigation.deeplink.action.QUICK_ACTION", "android.nfc.action.NDEF_DISCOVERED"}, str3)) {
                    jf0.c deeplink = ((s06.c) jVar.i).d(str2);
                    if (deeplink == null) {
                        deeplink = null;
                    } else {
                        b bVar = jVar.f284770q;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        r rVar = bVar.f284754a;
                        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                        od0.a aVar = od0.a.f224253a;
                        if (od0.a.e() && Intrinsics.f(deeplink.e(2), "record") && Intrinsics.f(deeplink.e(3), "start")) {
                            String str4 = (String) deeplink.d.get("redirect");
                            if (str4 != null) {
                                deeplink = ((s06.c) ((q06.d) rVar.f250851a)).d(str4);
                            }
                            e0.C((CoroutineScope) rVar.f250853c, null, null, new v0(rVar, null, 13), 3);
                        }
                    }
                    if (deeplink == null) {
                        d0VarM = jVar.N(str2, str3);
                    } else {
                        zli.b bVarW = k.w(deeplink);
                        awa.b bVarB = jVar.o.b(bVarW);
                        if (bVarB == null) {
                            str = null;
                        } else {
                            Iterator it8 = bVarB.f10755b.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (l.s(bVarW, (String) next) != null) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            str = (String) next;
                        }
                        if (str == null) {
                            str = deeplink.e;
                        }
                        jVar.k.a(str, deeplink.f173627a, za.Received, false);
                        if (deeplink.f173628b != jf0.e.ACTION || (Intrinsics.f(str3, "com.revolut.navigation.deeplink.action.QUICK_ACTION") && (num == null || (num.intValue() & PKIFailureInfo.badCertTemplate) == 0))) {
                            o oVar = (o) jVar.f284765j;
                            oVar.getClass();
                            Intrinsics.checkNotNullParameter(deeplink, "deepLink");
                            ufm.i iVar = new ufm.i(oVar.f258869b.b(), new ryd.j(new s06.k(oVar, deeplink, i2), 25), 0);
                            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                            d0VarM = iVar;
                        } else {
                            d0VarM = d0.m(new FinishCommand(null, null, null, 7));
                            Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                        }
                    }
                } else {
                    d0VarM = jVar.N(str2, str3);
                }
                return ue0.e.D(d0VarM, new h(jVar, str2, i2));
        }
    }
}
