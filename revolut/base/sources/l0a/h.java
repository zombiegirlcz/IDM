package l0a;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import do3.n;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n38.y;
import org.jmrtd.cbeff.ISO781611;
import tof.fc;
import tof.i7;
import tof.la;
import tof.na;
import tof.oa;
import tof.x9;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatTransferRecipient f191200b;

    public /* synthetic */ h(ChatTransferRecipient chatTransferRecipient, int i) {
        this.f191199a = i;
        this.f191200b = chatTransferRecipient;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i7 i7VarB;
        int i = this.f191199a;
        ChatTransferRecipient chatTransferRecipient = this.f191200b;
        switch (i) {
            case 0:
                f5j.a content = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                return new ChatTransferRecipient.BeneficiaryRecipient(content, ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79717b);
            case 1:
                CryptoAddress content2 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(content2, "content");
                ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient;
                return new ChatTransferRecipient.CryptoAddressRecipient(content2, cryptoAddressRecipient.f79722b, cryptoAddressRecipient.f79723c);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                n nVar = (n) pair.f186385a;
                od0.i iVar = (od0.i) pair.f186386b;
                zm3.a aVar = ((ChatTransferRecipient.ContactRecipient) chatTransferRecipient).f79720a;
                if (aVar instanceof zm3.j) {
                    i7.c cVar = i7.Companion;
                    i7[] i7VarArr = {new x9(nVar.f116408a), new x9(null), new la(((zm3.j) aVar).f)};
                    cVar.getClass();
                    oa oaVarB = i7.c.b(i7VarArr);
                    y yVar = (y) iVar.f224257a;
                    i7VarB = fc.a(oaVarB, yVar != null ? new na(new x9(yVar.f211967a)) : null);
                } else if (aVar instanceof zm3.i) {
                    i7.c cVar2 = i7.Companion;
                    i7[] i7VarArr2 = {new x9(nVar.f116408a), new x9(null), new la(((zm3.i) aVar).f323353g)};
                    cVar2.getClass();
                    oa oaVarB2 = i7.c.b(i7VarArr2);
                    y yVar2 = (y) iVar.f224257a;
                    i7VarB = fc.a(oaVarB2, yVar2 != null ? new na(new x9(yVar2.f211967a)) : null);
                } else {
                    i7.c cVar3 = i7.Companion;
                    i7[] i7VarArr3 = {new x9(nVar.f116408a), new x9(null)};
                    cVar3.getClass();
                    i7VarB = i7.c.b(i7VarArr3);
                }
                i7 i7VarA = fc.a(new na(i7.z.f272831a), i7VarB);
                od0.i.Companion.getClass();
                return od0.h.a(i7VarA);
            default:
                r0a.i update = (r0a.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r0a.i.a(update, null, this.f191200b, null, null, null, null, ISO781611.SMT_TAG);
        }
    }

    public /* synthetic */ h(ChatTransferRecipient chatTransferRecipient, qz9.n nVar) {
        this.f191199a = 2;
        this.f191200b = chatTransferRecipient;
    }
}
