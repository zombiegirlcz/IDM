package sl7;

import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f264158a = new a();

        private a() {
        }

        @Override // sl7.h
        public final String a() {
            return "https://www.revolut.com/en-IE/legal/car-insurance-privacy-notice";
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f264159a = new b();

        private b() {
        }

        @Override // sl7.h
        public final String a() {
            return "https://www.aig.ie/privacy-policy";
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f264160a = new c();

        private c() {
        }

        @Override // sl7.h
        public final String a() {
            return "https://www.revolut.com/en-IE/legal/terms-of-business";
        }
    }

    private h() {
    }

    public abstract String a();

    public final BridgeDestination b() {
        String url2 = a();
        Intrinsics.checkNotNullParameter(url2, "url");
        return new BridgeDestination(u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(url2, WebViewScreenTitleSource.Html.f98166a, false)), null, true)));
    }
}
