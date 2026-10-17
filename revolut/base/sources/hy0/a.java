package hy0;

import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoriesPagerView f156622b;

    public /* synthetic */ a(StoriesPagerView storiesPagerView, int i) {
        this.f156621a = i;
        this.f156622b = storiesPagerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f156621a;
        StoriesPagerView storiesPagerView = this.f156622b;
        switch (i) {
            case 0:
                StoriesPagerView.Companion companion = StoriesPagerView.INSTANCE;
                return new f(storiesPagerView);
            default:
                return new e(storiesPagerView);
        }
    }
}
