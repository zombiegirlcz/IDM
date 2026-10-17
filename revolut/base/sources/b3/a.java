package b3;

import b58.f;
import b74.w;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.uicomponent.card.ExternalCardView;
import com.revolut.uicomponent.products.d;
import ix0.t;
import java.time.LocalDate;
import java.util.Date;
import jli.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import oim.n;
import org.joda.time.format.DateTimeFormatterBuilder;
import qyl.i;
import yc4.k;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11969b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f11968a = i;
        this.f11969b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        String strY;
        int i = this.f11968a;
        Object obj6 = this.f11969b;
        switch (i) {
            case 0:
                break;
            case 1:
                LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = (LegacyEditConsentPreferencesScreen) obj6;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Date date = (Date) obj3;
                KProperty[] kPropertyArr = LegacyEditConsentPreferencesScreen.T;
                Intrinsics.checkNotNullParameter((String) obj5, "<unused var>");
                if (zBooleanValue && date != null) {
                    w wVarE3 = legacyEditConsentPreferencesScreen.d();
                    LocalDate date2 = ebm.a.N(date);
                    com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) wVarE3;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(date2, "date");
                    aVar.H2(aVar.f67279p, new f(aVar.I2(date2), aVar, 13));
                }
                break;
            case 2:
                t tVar = (t) obj6;
                CharSequence inputText = (CharSequence) obj2;
                String prefixText = (String) obj3;
                String suffixText = (String) obj4;
                String resultText = (String) obj5;
                Intrinsics.checkNotNullParameter(inputText, "inputText");
                Intrinsics.checkNotNullParameter(prefixText, "prefixText");
                Intrinsics.checkNotNullParameter(suffixText, "suffixText");
                Intrinsics.checkNotNullParameter(resultText, "resultText");
                if (inputText.length() == 0 && ((strY = tVar.f169296c.y()) == null || (inputText = m70.a.l(strY)) == null)) {
                    inputText = tVar.f169296c.getHintText();
                }
                String str = prefixText + inputText + suffixText + resultText;
                Intrinsics.i(str, "null cannot be cast to non-null type kotlin.CharSequence");
                break;
            case 3:
                break;
            case 4:
                ExternalCardView externalCardView = (ExternalCardView) obj6;
                ((Boolean) obj2).getClass();
                Date date3 = (Date) obj3;
                String expireDate = (String) obj5;
                int i2 = ExternalCardView.V;
                Intrinsics.checkNotNullParameter(expireDate, "extractedValue");
                i iVar = externalCardView.listener;
                if (iVar != null) {
                    if (date3 != null) {
                        externalCardView.f107143b.getClass();
                        Intrinsics.checkNotNullParameter(date3, "date");
                        String strPrint = new DateTimeFormatterBuilder().appendPattern("MM/yy").toFormatter().print(org.joda.time.LocalDate.fromDateFields(date3));
                        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
                        expireDate = g.f(strPrint);
                    }
                    Intrinsics.checkNotNullParameter(expireDate, "expireDate");
                    ((ihm.f) ((d) iVar).f107223a.d.getValue()).onNext(expireDate);
                }
                break;
            case 5:
                ihm.f fVar = (ihm.f) obj6;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Date date4 = (Date) obj3;
                String rawValue = (String) obj5;
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                fVar.onNext((date4 == null && rawValue.length() == 0 && !zBooleanValue2) ? DOBInputData.Empty.d : (rawValue.length() <= 0 || !zBooleanValue2) ? new DOBInputData.PartiallyFilled(rawValue) : new DOBInputData.Filled(rawValue, date4));
                break;
            default:
                String target = (String) obj2;
                String sessionId = (String) obj3;
                String sessionIdSignature = (String) obj4;
                String optionsJson = (String) obj5;
                KProperty[] kPropertyArr2 = KontomatikSignInController.U;
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(sessionIdSignature, "sessionIdSignature");
                Intrinsics.checkNotNullParameter(optionsJson, "optionsJson");
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) ((KontomatikSignInController) obj6).e3()).I2(new k(sessionId, sessionIdSignature));
                break;
        }
        return Unit.f186387a;
    }
}
