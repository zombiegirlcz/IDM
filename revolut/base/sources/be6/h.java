package be6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestDataAddress;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestDataDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import org.joda.time.DateTimeUtils;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, d.class, "toDomain", "toDomain(Lcom/revolut/feature/extension_auth/impl/data/ExtensionAuthTokenDto;)Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestData;", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k kVar;
        String str;
        ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice;
        ?? arrayList;
        ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress;
        k p0 = (k) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String code = p0.getCode();
        String tokenId = p0.getTokenId();
        long expiresIn = p0.getExpiresIn();
        long expiresIn2 = p0.getExpiresIn() + DateTimeUtils.currentTimeMillis();
        long createdDate = p0.getCreatedDate();
        zd6.b bVar = (zd6.b) u1.v(p0.getApplicationType(), r0.k(new Pair("BROWSER_EXTENSION", zd6.b.BROWSER_EXTENSION), new Pair("OPEN_BANKING", zd6.b.OPEN_BANKING), new Pair("WEB_CLIENT", zd6.b.WEB_CLIENT), new Pair("MOBILE_CLIENT", zd6.b.MOBILE_CLIENT)));
        c device = p0.getDevice();
        if (device != null) {
            String ipAddress = device.getIpAddress();
            String model = device.getModel();
            String system = device.getSystem();
            b address = device.getAddress();
            if (address != null) {
                kVar = p0;
                str = code;
                extensionAuthRequestDataAddress = new ExtensionAuthRequestDataAddress(address.getCountry(), address.getRegion(), address.getCity(), address.getPostcode());
            } else {
                kVar = p0;
                str = code;
                extensionAuthRequestDataAddress = null;
            }
            extensionAuthRequestDataDevice = new ExtensionAuthRequestDataDevice(ipAddress, model, system, extensionAuthRequestDataAddress);
        } else {
            kVar = p0;
            str = code;
            extensionAuthRequestDataDevice = null;
        }
        Map mapK = r0.k(new Pair("RESET_PASSWORD", zd6.a.RESET_PASSWORD), new Pair("CHANGE_PHONE", zd6.a.CHANGE_PHONE));
        List scopes = kVar.getScopes();
        if (scopes != null) {
            arrayList = new ArrayList();
            Iterator it8 = scopes.iterator();
            while (it8.hasNext()) {
                zd6.a aVar = (zd6.a) u1.v((String) it8.next(), mapK);
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return new ExtensionAuthRequestData.Verification(str, tokenId, expiresIn, expiresIn2, createdDate, extensionAuthRequestDataDevice, null, str, bVar, arrayList);
    }
}
