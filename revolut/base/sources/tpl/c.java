package tpl;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import kotlin.reflect.KProperty;
import t70.x;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdentityDocumentsScreen f273419a;

    public c(IdentityDocumentsScreen identityDocumentsScreen) {
        this.f273419a = identityDocumentsScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        if (i == 2) {
            KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
            IdentityDocumentsScreen identityDocumentsScreen = this.f273419a;
            identityDocumentsScreen.d3(identityDocumentsScreen.N);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
        IdentityDocumentsScreen identityDocumentsScreen = this.f273419a;
        identityDocumentsScreen.l3().post(new x(identityDocumentsScreen, 2));
    }
}
