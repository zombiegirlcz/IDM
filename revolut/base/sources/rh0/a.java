package rh0;

import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a extends q implements Function0 {
    public static final a f = new a();

    public a() {
        super(0, GoogleApiAvailability.class, "getInstance", "getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return GoogleApiAvailability.getInstance();
    }
}
