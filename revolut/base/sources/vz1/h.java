package vz1;

import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.SaversKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsActivity;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import efm.r;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z0h.t1;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293366a;

    public /* synthetic */ h(int i) {
        this.f293366a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293366a) {
            case 0:
                od0.i optionalBoolean = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalBoolean, "optionalBoolean");
                return Boolean.valueOf(Intrinsics.f(optionalBoolean.g(), Boolean.TRUE));
            case 1:
                lz4.a application = (lz4.a) obj2;
                Intrinsics.checkNotNullParameter(application, "application");
                return r.just(new Data(application, null, false, 6, null));
            case 2:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 3:
                pd5.d it8 = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f235100j;
                return list == null ? f0.f322471a : list;
            case 4:
                TradingLegalEntityInformation it9 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!(it9.f105106a == hel.b.GB));
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 6:
                hel.a stocksConfig = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                return new t1(stocksConfig.e, stocksConfig.d);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 8:
                return Boolean.valueOf(RetryingCameraStateOpener.openCameraWithRetry_aeCOTgg$lambda$0((Unit) obj2));
            case 9:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM slip_transactions");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 10:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                Set prohibitedCurrencies = config.U;
                Intrinsics.checkNotNullParameter(prohibitedCurrencies, "prohibitedCurrencies");
                return Boolean.valueOf(!prohibitedCurrencies.isEmpty());
            case 11:
                w1a.a update = (w1a.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data statusData = new Data(null, new IllegalStateException("Expected AlreadySplit with contacts, but got javaClass"), false);
                update.getClass();
                Intrinsics.checkNotNullParameter(statusData, "statusData");
                return new w1a.a(statusData);
            case 12:
                x1a.c output = (x1a.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof x1a.b) {
                    r6.b.r("OutputData.SplitCanceled is not expected as result here");
                } else if (!Intrinsics.f(output, x1a.a.f302355a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 13:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new w1a.c((List) getDefaultLoadingItems.invoke());
            case 14:
                InputTextDelegate.TextData it10 = (InputTextDelegate.TextData) obj2;
                int i = OrderSettingsActivity.f96904w0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f52598b.toString();
            case 15:
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj2));
            case 16:
                return MultiParagraphKt.findParagraphByIndex$lambda$2$0((ParagraphInfo) obj2);
            case 17:
                return SaversKt.TextLinkStylesSaver$lambda$1(obj2);
            case 18:
                return SaversKt.AnnotatedStringSaver$lambda$1(obj2);
            case 19:
                return SaversKt.TextDecorationSaver$lambda$1(obj2);
            case 20:
                return SaversKt.TextGeometricTransformSaver$lambda$1(obj2);
            case 21:
                return SaversKt.TextIndentSaver$lambda$1(obj2);
            case 22:
                return SaversKt.FontWeightSaver$lambda$1(obj2);
            case 23:
                return SaversKt.BaselineShiftSaver$lambda$1(obj2);
            case 24:
                return SaversKt.TextRangeSaver$lambda$1(obj2);
            case 25:
                return SaversKt.ShadowSaver$lambda$1(obj2);
            case 26:
                return SaversKt.TextAlignSaver$lambda$1(obj2);
            case 27:
                return SaversKt.LinkSaver$lambda$1(obj2);
            case 28:
                return SaversKt.TextDirectionSaver$lambda$1(obj2);
            default:
                return SaversKt.HyphensSaver$lambda$1(obj2);
        }
    }

    public /* synthetic */ h(w0i.a aVar) {
        this.f293366a = 10;
    }
}
