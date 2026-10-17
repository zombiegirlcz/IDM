package i51;

import az0.d;
import az0.q1;
import az0.r;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import z80.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements r, q1, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f158540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f158541b;

    public a(ij0.a networkConfiguration, b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f158540a = networkConfiguration;
        this.f158541b = phoneToolsProvider;
    }

    @Override // az0.q1
    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f158540a.getBaseUrl(), "/user/current/", "picture");
    }

    public final String b(ContactImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        String str = image.f59890c;
        String str2 = image.f59889b;
        String str3 = image.f59888a;
        String str4 = image.d;
        String baseUrl = this.f158540a.getBaseUrl();
        if (str != null && (!d0.W(str))) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(baseUrl, "/user/picture?code=", str);
        }
        if (str2 != null && (!d0.W(str2))) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(baseUrl, "/user/picture?username=", str2);
        }
        if (str3 != null && (!d0.W(str3)) && !str3.equals(str4)) {
            return j6.a.r(baseUrl, "/user/", str3, "/picture");
        }
        if (str4 != null && (!d0.W(str4)) && this.f158541b.k(str4, null)) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(baseUrl, "/user/picture?phone=", a0.D(str4, "+", "%2b", false));
        }
        return null;
    }

    public final String c(AvatarByUserIdImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return j6.a.r(this.f158540a.getBaseUrl(), "/user/", image.f59841a, "/picture");
    }
}
