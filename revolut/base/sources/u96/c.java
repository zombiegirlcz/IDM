package u96;

import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends q implements Function0 {
    public static final c f = new c();

    public c() {
        super(0, GoogleApiAvailability.class, "getInstance", "getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return GoogleApiAvailability.getInstance();
    }
}
