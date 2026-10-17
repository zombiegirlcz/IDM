package w2;

import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import com.revolut.data.network.models.openbanking.ExternalInstitutionDto;
import com.revolut.data.network.models.openbanking.ExternalInstitutionStatusDto;
import com.revolut.data.network.models.openbanking.mapper.ExternalInstitutionDtoMapperKt;
import com.revolut.data.network.models.openbanking.penny_verification.PennyAuthorisationResultDto;
import com.revolut.domain.models.openbanking.penny_verification.PennyAuthorisationResult;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import j19.g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l19.l;
import retrofit2.HttpException;
import retrofit2.Response;
import ybl.h;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293903a;

    public /* synthetic */ c(int i) {
        this.f293903a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293903a) {
            case 0:
                return SaversKt.AnnotationRangeListSaver$lambda$1(obj2);
            case 1:
                return SaversKt.FontStyleSaver$lambda$1(obj2);
            case 2:
                return SaversKt.FontSynthesisSaver$lambda$1(obj2);
            case 3:
                return SaversKt.TextUnitSaver$lambda$1(obj2);
            case 4:
                return SaversKt.TextUnitTypeSaver$lambda$1(obj2);
            case 5:
                return SaversKt.OffsetSaver$lambda$1(obj2);
            case 6:
                return SaversKt.LocaleListSaver$lambda$1(obj2);
            case 7:
                return SaversKt.LocaleSaver$lambda$1(obj2);
            case 8:
                return SaversKt.ClickableSaver$lambda$1(obj2);
            case 9:
                return SaversKt.LineHeightStyleSaver$lambda$1(obj2);
            case 10:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj2);
            case 11:
                return SaversKt.LineHeightStyleTrimSaver$lambda$1(obj2);
            case 12:
                return SaversKt.AnnotationRangeSaver$lambda$1(obj2);
            case 13:
                return SaversKt.LineHeightStyleModeSaver$lambda$1(obj2);
            case 14:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj2);
            case 15:
                return SaversKt.UrlAnnotationSaver$lambda$1(obj2);
            case 16:
                return SaversKt.ParagraphStyleSaver$lambda$1(obj2);
            case 17:
                return SaversKt.SpanStyleSaver$lambda$1(obj2);
            case 18:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj2);
            case 19:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj2);
            case 20:
                return Savers_androidKt.LineBreakSaver$lambda$1(obj2);
            case 21:
                return Savers_androidKt.TextMotionSaver$lambda$1(obj2);
            case 22:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj2);
            case 23:
                List institutions = (List) obj2;
                Intrinsics.checkNotNullParameter(institutions, "institutions");
                List list = institutions;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ExternalInstitutionDtoMapperKt.toDomain((ExternalInstitutionDto) it8.next()));
                }
                return arrayList;
            case 24:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                int iCode = response.code();
                if (iCode != 200) {
                    return iCode != 204 ? PennyAuthorisationResult.FAILED : PennyAuthorisationResult.IN_PROGRESS;
                }
                PennyAuthorisationResultDto pennyAuthorisationResultDto = (PennyAuthorisationResultDto) response.body();
                String state = pennyAuthorisationResultDto != null ? pennyAuthorisationResultDto.getState() : null;
                return Intrinsics.f(state, "PASSED") ? PennyAuthorisationResult.PASSED : Intrinsics.f(state, "FAILED") ? PennyAuthorisationResult.FAILED : PennyAuthorisationResult.FAILED;
            case 25:
                List institutions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(institutions2, "institutions");
                List list2 = institutions2;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(ExternalInstitutionDtoMapperKt.toDomain((ExternalInstitutionDto) it9.next()));
                }
                return arrayList2;
            case 26:
                List consents = (List) obj2;
                Intrinsics.checkNotNullParameter(consents, "consents");
                List list3 = consents;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(ExternalInstitutionDtoMapperKt.toDomain((ExternalInstitutionStatusDto) it10.next()));
                }
                return arrayList3;
            case 27:
                h it11 = (h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.d(TradingAccountType.Gia.f105270a));
            case 28:
                return g2.Companion.serializer();
            default:
                return l.INSTANCE.serializer();
        }
    }
}
