package bzl;

import android.telephony.PhoneNumberFormattingTextWatcher;
import bu7.y;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class l extends PhoneNumberFormattingTextWatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20069c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f20070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f20071b;

    public l() {
        this.f20070a = yhm.j.b(new y(26));
        this.f20071b = yhm.j.b(new y(27));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String countryCode) {
        super(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f20070a = yhm.j.b(new y(26));
        this.f20071b = yhm.j.b(new y(27));
    }
}
