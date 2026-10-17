package w2a;

import android.net.Uri;
import cli.y;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferPersonalisationGifSelector f293988w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransferPersonalisationGifSelector transferPersonalisationGifSelector, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f293988w = transferPersonalisationGifSelector;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f293988w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f293988w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f293988w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((i9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        TransferPersonalisationGifSelector transferPersonalisationGifSelector = this.f293988w;
        switch (i) {
            case 0:
                String emojiCode = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = transferPersonalisationGifSelector.e3();
                Intrinsics.h(emojiCode);
                sVarE3.getClass();
                Intrinsics.checkNotNullParameter(emojiCode, "emojiCode");
                y yVar = sVarE3.f294007r;
                Iterator it8 = ((j) ((j2) yVar.f22677a).getValue()).f293991a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((i9i.e) next).f159883b.equals(emojiCode)) {
                        }
                    } else {
                        next = null;
                    }
                }
                i9i.e eVar = (i9i.e) next;
                if (eVar != null) {
                    sVarE3.H2(yVar, new vx9.b(eVar, 24));
                }
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = transferPersonalisationGifSelector.e3();
                String query = charSequence.toString();
                sVarE32.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                sVarE32.H2(sVarE32.f294007r, new vb2.r(query, 24));
                break;
            default:
                i9i.c image = (i9i.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE33 = transferPersonalisationGifSelector.e3();
                sVarE33.getClass();
                Intrinsics.checkNotNullParameter(image, "image");
                y2a.a aVar4 = sVarE33.f294005p;
                i9i.a image2 = image.f159879b;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(image2, "image");
                String string = Uri.parse(image2.f159875a).buildUpon().appendQueryParameter("revolut_h", String.valueOf(image2.f159877c)).appendQueryParameter("revolut_w", String.valueOf(image2.f159876b)).build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sVarE33.C2(new g2a.d(string));
                break;
        }
        return Unit.f186387a;
    }
}
