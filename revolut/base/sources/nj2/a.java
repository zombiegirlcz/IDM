package nj2;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.articles_deeplinks_impl.navigation.ArticleWebViewControllerDescriptor;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreenContract$InputData;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import xii.b;
import xii.d;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements b, p {

    @NotNull
    private static final C1207a Companion = new C1207a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f216347a = y0.b(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f216348b = y0.b("articles/{articleId}");

    /* JADX INFO: renamed from: nj2.a$a, reason: collision with other inner class name */
    public static final class C1207a {
        private C1207a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f216348b;
    }

    @Override // aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof ArticleWebViewControllerDescriptor)) {
            return null;
        }
        ArticleWebViewControllerDescriptor articleWebViewControllerDescriptor = (ArticleWebViewControllerDescriptor) descriptor;
        return articleWebViewControllerDescriptor.a(new ArticleWebViewScreen(new ArticleWebViewScreenContract$InputData(articleWebViewControllerDescriptor.f63114b, articleWebViewControllerDescriptor.f63113a)));
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        LinkedHashMap linkedHashMap2 = deeplink.f195041c;
        String str = (String) linkedHashMap.get("articleId");
        if (str != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str2 = (String) zhm.d0.u0((Set) entry.getValue());
                    if (str2 != null) {
                        linkedHashMap3.put(entry.getKey(), str2);
                    }
                }
                ArticleWebViewControllerDescriptor descriptor = new ArticleWebViewControllerDescriptor(linkedHashMap3, str);
                Intrinsics.checkNotNullParameter(deeplink, "<this>");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                String strA = lg0.g.a("presentation_style", linkedHashMap2);
                if (!Intrinsics.f(strA, d.PUSH.b()) && Intrinsics.f(strA, d.MODAL.b())) {
                    return new ControllerDestination.Modal(descriptor, ModalDestination.Style.POPUP.f98311a);
                }
                return new ControllerDestination.Stack(descriptor, null, true);
            }
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f216347a;
    }
}
