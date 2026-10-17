package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.y2;
import q90.z2;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f278322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f278323b;

    public k0(qd0.b languageProvider, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f278322a = languageProvider;
        this.f278323b = phoneToolsProvider;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        String strJ;
        String code;
        Integer numM;
        y2 item = (y2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String country = ((s80.b) this.f278322a).a().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        wi0.b bVarC = com.bumptech.glide.d.c(country);
        fj0.a aVar = fj0.b.Companion;
        z2 value = item.getValue();
        z80.b bVar = this.f278323b;
        if (value == null || (strJ = value.getCode()) == null) {
            strJ = bVar.j(bVarC);
        }
        aVar.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        yhm.o.b(serializableB);
        int i = ((fj0.b) serializableB).f135518a;
        z2 value2 = item.getValue();
        if (value2 != null && (code = value2.getCode()) != null) {
            StringBuilder sb6 = new StringBuilder();
            int length = code.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = code.charAt(i2);
                if (Character.isDigit(cCharAt)) {
                    sb6.append(cCharAt);
                }
            }
            String string = sb6.toString();
            if (string != null && (numM = kotlin.text.z.m(string)) != null) {
                bVarC = bVar.d(numM.intValue());
            }
        }
        wi0.b bVar2 = bVarC;
        String id10 = item.getId();
        boolean required = item.getRequired();
        z2 value3 = item.getValue();
        ArrayList arrayList = null;
        String number = value3 != null ? value3.getNumber() : null;
        String hint = item.getHint();
        String searchHint = item.getSearchHint();
        String dropdownHint = item.getDropdownHint();
        List countries = item.getCountries();
        if (countries != null) {
            List<y2.a> list = countries;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (y2.a aVar2 : list) {
                wi0.b bVarC2 = com.bumptech.glide.d.c(aVar2.getCountryCode());
                fj0.a aVar3 = fj0.b.Companion;
                int phoneCode = aVar2.getPhoneCode();
                aVar3.getClass();
                Serializable serializableA = fj0.a.a(phoneCode);
                yhm.o.b(serializableA);
                arrayList.add(new PhoneInputItem.Country(((fj0.b) serializableA).f135518a, aVar2.getDescription(), bVarC2));
            }
        }
        return new PhoneInputItem(id10, required, hint, searchHint, dropdownHint, i, number, bVar2, arrayList);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        PhoneInputItem item = (PhoneInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63569a;
        boolean z = item.f63570b;
        String str2 = item.f63571c;
        String str3 = item.d;
        String str4 = item.e;
        String str5 = item.f63572g;
        ArrayList arrayList = null;
        z2 z2Var = str5 != null ? new z2(hx7.a.J(item.f), str5) : null;
        List list = item.i;
        if (list != null) {
            List<PhoneInputItem.Country> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (PhoneInputItem.Country country : list2) {
                arrayList.add(new y2.a(country.f63575b, country.f63574a.f297794a, country.f63576c));
            }
        }
        return new y2(str, z, str2, str3, str4, arrayList, z2Var);
    }
}
