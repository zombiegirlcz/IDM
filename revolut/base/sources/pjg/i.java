package pjg;

import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.api.client.exception.TokenExpiredException;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.data.model.Data;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.io.IOException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import pij.d1;
import pl.q;
import pnh.a0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements kfm.p, kfm.o, ObservableTransformer, igm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f236759b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f236758a = i;
        this.f236759b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        d1 d1Var = (d1) this.f236759b;
        int i = VideoBackgroundView.f51501c;
        d1Var.invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        ErrorType errorType;
        ErrorType network;
        int i = this.f236758a;
        Object obj2 = this.f236759b;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
            case 11:
            case 17:
            case 18:
            case 20:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                q this$0 = (q) obj2;
                Throwable throwable = (Throwable) p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof TokenExpiredException) {
                    errorType = ErrorType.TokenExpired.INSTANCE;
                } else {
                    if (throwable instanceof SSLPeerUnverifiedException) {
                        String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
                        network = new ErrorType.InvalidCertificate(localizedMessage != null ? localizedMessage : "");
                    } else {
                        if (throwable instanceof HttpException ? true : throwable instanceof IOException) {
                            String message = throwable.getMessage();
                            network = new ErrorType.Network(message != null ? message : "");
                        } else {
                            errorType = ErrorType.Generic.INSTANCE;
                        }
                    }
                    errorType = network;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                int i2 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                int i3 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Data) ((a0) obj2).invoke(p0);
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public ObservableSource b(Observable observable) {
        pl.j this$0 = (pl.j) this.f236759b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observable, "observable");
        return observable.doOnNext(new p56.a(this$0, 4)).doOnSubscribe(new onh.b(this$0, 5)).map(pl.g.f237228c);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f236758a;
        Object obj2 = this.f236759b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                break;
            case 18:
                int i2 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                int i3 = VideoBackgroundView.f51501c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((a0) obj2).invoke(p0)).booleanValue();
    }
}
