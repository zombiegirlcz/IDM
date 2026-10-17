package k50;

import com.revolut.chat_core.R$string;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f181161b;

    public /* synthetic */ k2(j4 j4Var, int i) {
        this.f181160a = i;
        this.f181161b = j4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181160a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return Boolean.valueOf(((h0) ((vkm.j2) this.f181161b.f181140w0.f22677a).getValue()).f181080b.getContent() == null);
            case 1:
                List updatedImages = (List) obj2;
                Intrinsics.checkNotNullParameter(updatedImages, "updatedImages");
                ArrayList<rd7.f> arrayList = new ArrayList();
                for (Object obj3 : updatedImages) {
                    if (obj3 instanceof rd7.f) {
                        arrayList.add(obj3);
                    }
                }
                int iB = zhm.q0.b(zhm.w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (rd7.f fVar : arrayList) {
                    linkedHashMap.put(fVar.f253364a, fVar.f253365b);
                }
                j4 j4Var = this.f181161b;
                j4Var.H2(j4Var.f181140w0, new awk.j(linkedHashMap, 9));
                return Unit.f186387a;
            case 2:
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof eii.i) {
                    Object obj4 = ((eii.i) output).f126655a;
                    boolean z = obj4 instanceof n50.e;
                    j4 j4Var2 = this.f181161b;
                    if (z) {
                        Object obj5 = ((n50.e) obj4).f212479a;
                        n50.u uVar = obj5 instanceof n50.u ? (n50.u) obj5 : null;
                        if (uVar != null) {
                            j4Var2.k3(R$string.chat_messages_copied, j4Var2.Q.b(uVar.f212512a).toString());
                        }
                    } else if (obj4 instanceof n50.f) {
                        j4Var2.q3(((n50.f) obj4).f212480a);
                    } else if (obj4 instanceof n50.g) {
                        j4Var2.r3(((n50.g) obj4).f212481a);
                    }
                }
                return Unit.f186387a;
            case 3:
                j4 j4Var3 = this.f181161b;
                w50.k kVar = j4Var3.f181141x;
                o40.e eVar = (o40.e) obj2;
                if (eVar instanceof o40.d) {
                    j4Var3.H2(j4Var3.f181140w0, new l2(11));
                } else if (eVar instanceof o40.b) {
                    kVar.Z2(null);
                } else {
                    if (!(eVar instanceof o40.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.Z2(((o40.c) eVar).f221905a);
                }
                return Unit.f186387a;
            default:
                h0 h0Var = (h0) obj2;
                return h0.a(h0Var, null, null, null, null, o0.a(h0Var.e, null, 0L, null, null, false, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG), null, null, null, null, null, false, false, null, null, b1.a(h0Var.f181090r, null, null, null, null, 23), new c0(this.f181161b.R.a(), h0Var.f181094x == v0.PROMPT ? xo0.e.PROMPT_SUGGESTION : xo0.e.CHAT_INPUT, e0.FILE), false, null, null, null, null, null, null, null, 268042223);
        }
    }
}
