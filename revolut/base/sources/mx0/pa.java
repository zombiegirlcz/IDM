package mx0;

import android.graphics.Bitmap;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class pa implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewRevolutCardView f209936b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209935a) {
            case 0:
                return NewRevolutCardView.d(this.f209936b);
            default:
                return NewRevolutCardView.c(this.f209936b, (Bitmap) obj2);
        }
    }
}
