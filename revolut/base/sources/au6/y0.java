package au6;

import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y0 implements zk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResponseBody f9663b;

    public /* synthetic */ y0(int i, ResponseBody responseBody) {
        this.f9662a = i;
        this.f9663b = responseBody;
    }

    @Override // zk0.c
    public final void g(FileOutputStream outputStream) throws IOException {
        switch (this.f9662a) {
            case 0:
                Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                outputStream.write(zi0.c.H(this.f9663b.byteStream()));
                break;
            default:
                Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                zi0.c.m(this.f9663b.byteStream(), outputStream, 8192);
                break;
        }
    }
}
