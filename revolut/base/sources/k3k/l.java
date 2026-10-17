package k3k;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.collect.ImmutableList;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements kfm.o, kfm.p, kfm.b, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180779b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f180778a = i;
        this.f180779b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        switch (this.f180778a) {
            case 5:
                ((SubtitleExtractor) this.f180779b).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj2);
                break;
            default:
                ((ImmutableList.Builder) this.f180779b).add((CuesWithTiming) obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f180778a;
        Object obj2 = this.f180779b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (efm.h0) ((k61.g) obj2).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f180778a;
        k37.s sVar = (k37.s) this.f180779b;
        switch (i) {
            case 1:
                KProperty[] kPropertyArr = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                KProperty[] kPropertyArr2 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                MessagesScreen.a aVar = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) sVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        ((k) this.f180779b).invoke(obj2, obj3);
    }
}
