package l6d;

import android.net.Uri;
import com.revolut.feature.address.models.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k6d.g;
import k6d.h;
import k6d.j;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f192401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uh1.a f192402b;

    public a(qd0.b languageProvider, uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f192401a = languageProvider;
        this.f192402b = addressPrinter;
    }

    public final Uri.Builder a(List list, String str, j jVar, Address address, h hVar) throws IOException {
        String strK0;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("checkout.revolut.com").appendPath("payment-link-preview").appendQueryParameter("availablePaymentMethods", d0.k0(list, ",", null, null, 0, null, 62)).appendQueryParameter("merchantDescriptor", str);
        s80.b bVar = (s80.b) this.f192401a;
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("countryCode", bVar.b().getCountry()).appendQueryParameter("locale", bVar.b().getLanguage()).appendQueryParameter("color", "#" + hVar.f181686b);
        k6d.c cVar = hVar.i;
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("logoImage", cVar != null ? cVar.f181683b : null);
        k6d.c cVar2 = hVar.f181689h;
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("backgroundImage", cVar2 != null ? cVar2.f181683b : null);
        if (address != null) {
            boolean z = hVar.d;
            uh1.a aVar = this.f192402b;
            if (z) {
                yi1.a aVar2 = (yi1.a) aVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(", ", "separator");
                ugc.a aVar3 = aVar2.f314212a;
                Intrinsics.checkNotNullParameter(address, "address");
                String[] elements = {address.getStreetLine1(), address.getStreetLine2(), address.getPostcode(), address.getCity(), address.getRegion(), ((lj1.a) ((rh1.b) aVar3.f279998b)).b(address.getCountry())};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = d.L(elements);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listL) {
                    if (((String) obj2).length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                strK0 = d0.k0(arrayList, ", ", null, null, 0, null, 62);
            } else {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(", ", "separator");
                ugc.a aVar4 = ((yi1.a) aVar).f314212a;
                Intrinsics.checkNotNullParameter(address, "address");
                String[] elements2 = {address.getCity(), ((lj1.a) ((rh1.b) aVar4.f279998b)).b(address.getCountry())};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = d.L(elements2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listL2) {
                    if (((String) obj3).length() != 0) {
                        arrayList2.add(obj3);
                    }
                }
                strK0 = d0.k0(arrayList2, ", ", null, null, 0, null, 62);
            }
            builderAppendQueryParameter4.appendQueryParameter("address", strK0);
        }
        if (hVar.f181688g && jVar.f181695a.length() > 0) {
            builderAppendQueryParameter4.appendQueryParameter("email", jVar.f181695a);
        }
        if (hVar.f) {
            jVar.getClass();
        }
        if (hVar.e && jVar.f181696b.length() > 0) {
            builderAppendQueryParameter4.appendQueryParameter("website", jVar.f181696b);
        }
        Intrinsics.h(builderAppendQueryParameter4);
        return builderAppendQueryParameter4;
    }

    public final String b(String businessName, h brandingSettings, List allowedPaymentMethods, j settings, Address address, String currencyCode, String amount, String description, i6d.a type, g gVar) {
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter("checkout.revolut.com", "brandingAuthority");
        Intrinsics.checkNotNullParameter(brandingSettings, "brandingSettings");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Uri.Builder builderAppendQueryParameter = a(allowedPaymentMethods, businessName, settings, address, brandingSettings).appendQueryParameter("currency", currencyCode).appendQueryParameter("amount", amount).appendQueryParameter("description", description).appendQueryParameter("type", type.name());
        if (gVar != null) {
            builderAppendQueryParameter.appendQueryParameter("profileType", gVar.name());
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
