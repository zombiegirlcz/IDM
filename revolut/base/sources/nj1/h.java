package nj1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address_picker.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements d {

    @NotNull
    public static final e Companion = new e();
    public static final String[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f216329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f216330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gj1.b f216331c;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.a aVar2 = wi0.b.Companion;
        aVar.getClass();
        wi0.a aVar3 = wi0.b.Companion;
        aVar.getClass();
        wi0.a aVar4 = wi0.b.Companion;
        aVar.getClass();
        wi0.a aVar5 = wi0.b.Companion;
        aVar.getClass();
        wi0.a aVar6 = wi0.b.Companion;
        d = new String[]{"HK", "MC", "MO", "SG", "VA"};
    }

    public h(f0m.a asciiConverter, zzl.b regexMatcher, List extraFieldsValidators, n8b.a countryInteractor, gj1.b addressFormCustomizations) {
        Intrinsics.checkNotNullParameter(asciiConverter, "asciiConverter");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(extraFieldsValidators, "extraFieldsValidators");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(addressFormCustomizations, "addressFormCustomizations");
        this.f216329a = regexMatcher;
        this.f216330b = extraFieldsValidators;
        this.f216331c = addressFormCustomizations;
    }

    public final boolean a(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (kotlin.collections.d.I(d, address.getCountry())) {
            return true;
        }
        String city = address.getCity();
        if (city == null || d0.W(city)) {
            return false;
        }
        wi0.b bVarG = nz8.d.g(address);
        wi0.b.Companion.getClass();
        return bVarG.equals(wi0.b.h2) ? address.getCity() != null : address.getCity() != null;
    }

    public final b b(Address address, boolean z, List list) {
        b bVar = b.f216322c;
        if (z) {
            wi0.b bVarG = nz8.d.g(address);
            wi0.b.Companion.getClass();
            if (!bVarG.equals(wi0.b.L0)) {
                String postcode = address.getPostcode();
                if (postcode == null) {
                    postcode = "";
                }
                boolean z3 = false;
                if (!d0.W(postcode) && list.contains(postcode)) {
                    return new b(new TextLocalisedClause(R$string.validation_error_unsupported_postal_code, null, null, 14), false);
                }
                String postcode2 = address.getPostcode();
                if (postcode2 == null || d0.W(postcode2) || address.getPostcode() == null) {
                    return new b(null, false);
                }
                if (com.bumptech.glide.d.w(nz8.d.g(address))) {
                    String postcode3 = address.getPostcode();
                    boolean z4 = postcode3 != null && postcode3.length() == 5;
                    String postcode4 = address.getPostcode();
                    boolean z6 = postcode4 != null && ((zzl.c) this.f216329a).a("^(?!6[9]|7[0-5]|8[3-7]|9[1-9])\\d{0,5}$", postcode4);
                    if (z4 && z6) {
                        z3 = true;
                    }
                    return new b(z6 ? null : new TextLocalisedClause(R$string.validation_error_unsupported_postal_code, null, null, 14), z3);
                }
                if (!com.bumptech.glide.d.r(nz8.d.g(address))) {
                    b.Companion.getClass();
                    return bVar;
                }
                String postcode5 = address.getPostcode();
                if (postcode5 != null && postcode5.length() == 7) {
                    z3 = true;
                }
                return new b(z3 ? null : new TextLocalisedClause(R$string.validation_error_incorrect_postal_code, null, null, 14), z3);
            }
        }
        b.Companion.getClass();
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final boolean c(Address address) {
        String region;
        Intrinsics.checkNotNullParameter(address, "address");
        if (kotlin.collections.d.I(d, address.getCountry()) || !((region = address.getRegion()) == null || d0.W(region) || address.getRegion() == null)) {
            return true;
        }
        return (o8b.c.f222983j.containsKey(nz8.d.g(address)) || this.f216331c.a(nz8.d.g(address))) ? false : true;
    }

    public final boolean d(Address address) {
        String neighborhood;
        wi0.b bVarG = nz8.d.g(address);
        Intrinsics.checkNotNullParameter(bVarG, "<this>");
        if (com.bumptech.glide.d.n(bVarG) || com.bumptech.glide.d.u(bVarG) || com.bumptech.glide.d.t(bVarG)) {
            Intrinsics.checkNotNullParameter(bVarG, "<this>");
            if (com.bumptech.glide.d.n(bVarG) || com.bumptech.glide.d.u(bVarG) || ((neighborhood = address.getNeighborhood()) != null && !d0.W(neighborhood))) {
                String neighborhood2 = address.getNeighborhood();
                return (neighborhood2 == null || d0.W(neighborhood2) || address.getNeighborhood() == null) ? false : true;
            }
        }
        return true;
    }

    /* JADX WARN: Path cross not found for [B:28:0x0093, B:23:0x007a], limit reached: 249 */
    /* JADX WARN: Path cross not found for [B:34:0x00a7, B:41:0x00be], limit reached: 249 */
    /* JADX WARN: Path cross not found for [B:65:0x01b0, B:62:0x01aa], limit reached: 249 */
    /* JADX WARN: Path cross not found for [B:77:0x01fe, B:74:0x01f8], limit reached: 249 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0228 -> B:84:0x022f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.address.models.AddressFormat r43, com.revolut.feature.address.models.Address r44, boolean r45, java.util.List r46, gim.c r47) {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nj1.h.e(com.revolut.feature.address.models.AddressFormat, com.revolut.feature.address.models.Address, boolean, java.util.List, gim.c):java.lang.Object");
    }
}
