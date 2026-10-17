package vdm;

import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288087a;

    public /* synthetic */ d(int i) {
        this.f288087a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f288087a) {
            case 0:
                return new oem.e();
            default:
                return new OkHttpClient(new OkHttpClient.a());
        }
    }
}
