package aq0;

import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GalleryPickerView f8224b;

    public /* synthetic */ h(GalleryPickerView galleryPickerView, int i) {
        this.f8223a = i;
        this.f8224b = galleryPickerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8223a) {
            case 0:
                return Boolean.valueOf(this.f8224b.f55814p);
            case 1:
                return Boolean.valueOf(this.f8224b.f55816r);
            default:
                return Float.valueOf(this.f8224b.o);
        }
    }
}
