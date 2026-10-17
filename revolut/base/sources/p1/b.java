package p1;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider f231580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextContextMenuDataProvider f231581c;

    public /* synthetic */ b(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider, int i) {
        this.f231579a = i;
        this.f231580b = androidTextContextMenuToolbarProvider;
        this.f231581c = textContextMenuDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f231579a) {
            case 0:
                return this.f231580b.observeAndGetData(this.f231581c);
            case 1:
                return this.f231580b.observeAndGetBounds(this.f231581c);
            default:
                return AndroidTextContextMenuToolbarProvider.observeAndGetBounds$lambda$0(this.f231580b, this.f231581c);
        }
    }
}
