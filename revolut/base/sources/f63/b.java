package f63;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final IntentFilter[] d = {new IntentFilter("android.nfc.action.TECH_DISCOVERED")};
    public static final String[][] e = {new String[]{IsoDep.class.getName()}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f132397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NfcAdapter f132398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f132399c;

    public b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f132397a = activity;
        this.f132398b = NfcAdapter.getDefaultAdapter(activity);
        this.f132399c = PendingIntent.getActivity(activity, 0, new Intent(activity, activity.getClass()).addFlags(PKIFailureInfo.duplicateCertReq), 33554432);
    }
}
