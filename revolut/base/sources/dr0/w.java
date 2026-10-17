package dr0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.ui.text.intl.LocaleList;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117068a;

    public /* synthetic */ w(int i) {
        this.f117068a = i;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f117068a) {
            case 0:
                Canvas canvas = (Canvas) obj2;
                RectF rect = (RectF) obj3;
                float fFloatValue = ((Float) obj4).floatValue();
                Paint paint = (Paint) obj5;
                RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(rect, "rect");
                Intrinsics.checkNotNullParameter(paint, "paint");
                canvas.drawRoundRect(rect, fFloatValue, fFloatValue, paint);
                return Unit.f186387a;
            case 1:
                LocalDate checkInDate = (LocalDate) obj2;
                LocalDate checkOutDate = (LocalDate) obj3;
                List roomsList = (List) obj4;
                LocationData locationData = (LocationData) obj5;
                Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
                Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                Intrinsics.checkNotNullParameter(locationData, "locationData");
                return new gcg.s(roomsList, checkInDate, checkOutDate, locationData);
            case 2:
                ((Boolean) obj2).booleanValue();
                KProperty[] kPropertyArr = DebtDetailsController.T;
                Intrinsics.checkNotNullParameter((String) obj5, "<unused var>");
                return Unit.f186387a;
            case 3:
                return PlatformSelectionBehaviors_androidKt.PlatformSelectionBehaviorsFactory$lambda$0((CoroutineContext) obj2, (Context) obj3, (SelectedTextType) obj4, (LocaleList) obj5);
            default:
                Boolean p2pOutgoingTransfersEnabled = (Boolean) obj2;
                Boolean moneyRequestsEnabled = (Boolean) obj3;
                Boolean bankTransferEnabled = (Boolean) obj4;
                Boolean pushToCardTransfersEnabled = (Boolean) obj5;
                Intrinsics.checkNotNullParameter(p2pOutgoingTransfersEnabled, "p2pOutgoingTransfersEnabled");
                Intrinsics.checkNotNullParameter(moneyRequestsEnabled, "moneyRequestsEnabled");
                Intrinsics.checkNotNullParameter(bankTransferEnabled, "bankTransferEnabled");
                Intrinsics.checkNotNullParameter(pushToCardTransfersEnabled, "pushToCardTransfersEnabled");
                return new w5k.a(p2pOutgoingTransfersEnabled.booleanValue(), moneyRequestsEnabled.booleanValue(), bankTransferEnabled.booleanValue(), pushToCardTransfersEnabled.booleanValue());
        }
    }
}
