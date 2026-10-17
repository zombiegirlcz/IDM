package pv9;

import do3.n;
import efm.d0;
import efm.r;
import java.security.KeyPair;
import java.util.List;
import javax.crypto.SecretKey;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n68.w;
import om4.l0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f240024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f240025c;

    public /* synthetic */ g(i iVar, String str, int i) {
        this.f240023a = i;
        this.f240024b = iVar;
        this.f240025c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240023a) {
            case 0:
                List itemsForUpdate = (List) obj2;
                Intrinsics.checkNotNullParameter(itemsForUpdate, "itemsForUpdate");
                if (itemsForUpdate.isEmpty()) {
                    return pfm.m.f235744a;
                }
                return this.f240024b.f240028a.updateGroupKeys(this.f240025c, new kv9.g(itemsForUpdate));
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                n nVar = (n) hVar.f288434b;
                KeyPair keyPair = (KeyPair) hVar.f288435c;
                SecretKey secretKey = (SecretKey) hVar.d;
                r rVarFromIterable = r.fromIterable(list);
                i iVar = this.f240024b;
                d0 list2 = rVarFromIterable.flatMapSingle(new prl.n(25, new l0(iVar, 29, keyPair, nVar))).filter(new prl.n(26, new pth.l(secretKey, 7))).flatMapSingle(new prl.n(27, new w(iVar, secretKey, keyPair, nVar, 28))).toList();
                prl.n nVar2 = new prl.n(19, new g(iVar, this.f240025c, 0));
                list2.getClass();
                return new pfm.a(list2, nVar2, 4);
        }
    }
}
