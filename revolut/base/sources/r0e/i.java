package r0e;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.network.models.beneficiary.BankBeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiarySearchListDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryValidationResultDto;
import com.revolut.data.network.models.beneficiary.CounterPartyInformationDto;
import com.revolut.data.network.models.beneficiary.RouteDetailsDto;
import com.revolut.data.network.models.beneficiary.SupportedCountryDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.data.network.models.recurringpayment.mapper.RecurringPaymentDtoMapperKt;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n61.e;
import o9l.r;
import qua.p;
import r0e.n;
import retrofit2.HttpException;
import rp0.z;
import u10.o;
import vkm.v1;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250775a;

    public /* synthetic */ i(int i) {
        this.f250775a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f250775a) {
            case 0:
                return new v1(new k((StatementUrlState) obj2, null));
            case 1:
                n.a aVar = n.Companion;
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(t61.a.o("ID_TAX_PERIOD_LOADING_", i, pb0.Companion, false, 4));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 2:
                CellDetailsActionDelegate.Model data = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = McyExchangeRateScreen.U;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(Intrinsics.f(data.f51781a, "ID_TAXES_CELL_ITEM"));
            case 3:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM feeds");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isActive");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowOpeningTicket");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allowArchiving");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "archived");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new u10.j(s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow)), s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM feeds").step();
                    return null;
                } finally {
                }
            case 5:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM message_search").step();
                    return Unit.f186387a;
                } finally {
                }
            case 6:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM pending_uploads WHERE status = 'COMPLETED'").step();
                    return Unit.f186387a;
                } finally {
                }
            case 7:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pending_uploads WHERE status = 'COMPLETED'");
                try {
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploadCorrelationId");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageId");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageCorrelationId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "filePath");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentType");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        UUID uuidH4 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        Intrinsics.checkNotNullParameter(value, "value");
                        arrayList2.add(new u10.n(uuidH, uuidH2, uuidH3, uuidH4, text, text2, o.valueOf(value), sQLiteStatementPrepare.getLong(columnIndexOrThrow15)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 8:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pending_uploads WHERE status != 'COMPLETED'");
                try {
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploadCorrelationId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageId");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageCorrelationId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "filePath");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentType");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        UUID uuidH5 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                        UUID uuidH6 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                        UUID uuidH7 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                        UUID uuidH8 = s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19));
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                        String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        Intrinsics.checkNotNullParameter(value2, "value");
                        arrayList3.add(new u10.n(uuidH5, uuidH6, uuidH7, uuidH8, text3, text4, o.valueOf(value2), sQLiteStatementPrepare.getLong(columnIndexOrThrow23)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 9:
                List entries = (List) obj2;
                Intrinsics.checkNotNullParameter(entries, "entries");
                od0.h hVar = od0.i.Companion;
                y02.d dVar = (y02.d) d0.d0(entries);
                ProductAccountListAction productAccountListAction = dVar != null ? dVar.f310103b : null;
                hVar.getClass();
                return od0.h.a(productAccountListAction);
            case 10:
                List entries2 = (List) obj2;
                Intrinsics.checkNotNullParameter(entries2, "entries");
                List list = entries2;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((y02.d) it8.next()).f310102a);
                }
                return arrayList4;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listC = u.c(new t10("ID_LOADING_ITEM", p10.f165755a));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new r15.j(new TextLocalisedClause(R$string.financial_difficulties_title, null, null, 14), listC);
            case 12:
                LocationDomain lastLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
                od0.i.Companion.getClass();
                return od0.h.a(lastLocation);
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 14:
                List beneficiaries = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                return n61.j.a("", beneficiaries);
            case 15:
                BeneficiaryFieldsDto dto = (BeneficiaryFieldsDto) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return BeneficiaryResponseMapperKt.toDomain(dto);
            case 16:
                BeneficiaryDto it9 = (BeneficiaryDto) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return BeneficiaryEntityMapperKt.toDomain$default(it9, 0, 0L, null, 7, null);
            case 17:
                CounterPartyInformationDto it10 = (CounterPartyInformationDto) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new n61.d(it10.getInstitutionName(), it10.getLogoUrl(), it10.getPayeeMaskedName(), it10.getPayeeNameConfirmationId());
            case 18:
                BankBeneficiaryDto result = (BankBeneficiaryDto) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return new n61.f(result.getId());
            case 19:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return ((error instanceof HttpException) && ((HttpException) error).code() == 404) ? efm.d0.m(e.a.f212682a) : efm.d0.l(error);
            case 20:
                BeneficiaryDto it11 = (BeneficiaryDto) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return BeneficiaryEntityMapperKt.toDomain$default(it11, 0, 0L, null, 7, null);
            case 21:
                BeneficiaryValidationResultDto it12 = (BeneficiaryValidationResultDto) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return BeneficiaryResponseMapperKt.toDomain(it12);
            case 22:
                BeneficiarySearchListDto it13 = (BeneficiarySearchListDto) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return BeneficiaryResponseMapperKt.toDomain(it13);
            case 23:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                ArrayList arrayList5 = new ArrayList();
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    p pVarM3759toDomainSafeE67O_EE$default = RecurringPaymentDtoMapperKt.m3759toDomainSafeE67O_EE$default((r) it14.next(), null, 1, null);
                    if (pVarM3759toDomainSafeE67O_EE$default != null) {
                        arrayList5.add(pVarM3759toDomainSafeE67O_EE$default);
                    }
                }
                return arrayList5;
            case 24:
                List types = (List) obj2;
                Intrinsics.checkNotNullParameter(types, "types");
                List list3 = types;
                ArrayList arrayList6 = new ArrayList(w.t(list3, 10));
                Iterator it15 = list3.iterator();
                while (it15.hasNext()) {
                    arrayList6.add(BeneficiaryResponseMapperKt.toDomain((RouteDetailsDto) it15.next()));
                }
                return arrayList6;
            case 25:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                List list5 = list4;
                ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
                Iterator it16 = list5.iterator();
                while (it16.hasNext()) {
                    arrayList7.add(BeneficiaryResponseMapperKt.toDomain((SupportedCountryDto) it16.next()));
                }
                return arrayList7;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 27:
                ty0.a it17 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new yx4.b(it17.f275445a, it17.d, null);
            case 28:
                z it18 = (z) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new yx4.b(it18.f256227a, it18.f256228b, null);
            default:
                s2c.a response = (s2c.a) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getAccessToken();
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f250775a = i;
    }
}
