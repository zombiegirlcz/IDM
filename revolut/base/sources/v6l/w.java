package v6l;

import com.revolut.data.model.Data;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f286511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f286512c;

    public /* synthetic */ w(String str, b1 b1Var) {
        this.f286510a = 0;
        this.f286512c = str;
        this.f286511b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        pfm.h hVarO;
        h93.f0 f0Var;
        Object next;
        switch (this.f286510a) {
            case 0:
                h93.f0 it8 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String str = this.f286512c;
                b1 b1Var = this.f286511b;
                if (str != null) {
                    b1Var.getClass();
                    hVarO = new pfm.h(new r2d.e(b1Var, 20, it8, str), 2);
                    Intrinsics.checkNotNullExpressionValue(hVarO, "fromAction(...)");
                } else {
                    hVarO = b1Var.o(it8);
                }
                return hVarO.f(te0.w.j(it8));
            case 1:
                String base64Image = (String) obj2;
                Intrinsics.checkNotNullParameter(base64Image, "imageBase64");
                String cardId = this.f286512c;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(base64Image, "base64Image");
                b1 b1Var2 = this.f286511b;
                pfm.a aVarE = b1Var2.f286424a.updateCardPersonalisationImage(cardId, new q6l.c(new q6l.b(base64Image))).e(new pfm.h(new x(b1Var2, 3), 2));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return te0.w.g0(aVarE);
            case 2:
                Response cardDetailsResponse = (Response) obj2;
                Intrinsics.checkNotNullParameter(cardDetailsResponse, "it");
                kge.d dVar = this.f286511b.d;
                Intrinsics.checkNotNullParameter(cardDetailsResponse, "cardDetailsResponse");
                String id10 = this.f286512c;
                Intrinsics.checkNotNullParameter(id10, "id");
                Pair pairX = dVar.x(cardDetailsResponse);
                p6l.p pVar = (p6l.p) pairX.f186385a;
                String token = (String) pairX.f186386b;
                k6l.b bVar = (k6l.b) dVar.f183975c;
                String pan = pVar.getPan();
                String cvv = pVar.getCvv();
                boolean skipCache = pVar.getSkipCache();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(pan, "pan");
                Intrinsics.checkNotNullParameter(cvv, "cvv");
                Intrinsics.checkNotNullParameter(token, "token");
                byte[] bArrA = bVar.a(pan, token);
                Charset charset = Charsets.UTF_8;
                return new h93.g0(id10, jli.g.f(new String(bArrA, charset)), jli.g.f(new String(bVar.a(cvv, token), charset)), skipCache);
            case 3:
                b1 b1Var3 = this.f286511b;
                String str2 = this.f286512c;
                Data cardsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(cardsData, "cardsData");
                try {
                    Object content = cardsData.getContent();
                    if (content != null) {
                        Iterator it9 = b1Var3.e((List) content).iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (Intrinsics.f(((h93.f0) next).f150110a, str2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        f0Var = (h93.f0) next;
                    } else {
                        f0Var = null;
                    }
                    return new Data(f0Var, cardsData.getError(), cardsData.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, cardsData.getLoading());
                }
            default:
                h93.f0 card = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                b1 b1Var4 = this.f286511b;
                if (!b1Var4.f286431m.contains(card.f)) {
                    ufm.b bVarM = efm.d0.m(card);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                pfm.a aVarE2 = b1Var4.n(this.f286512c).e(b1Var4.o(card));
                ufm.b bVarM2 = efm.d0.m(card);
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return aVarE2.f(bVarM2);
        }
    }

    public /* synthetic */ w(b1 b1Var, String str, int i) {
        this.f286510a = i;
        this.f286511b = b1Var;
        this.f286512c = str;
    }
}
