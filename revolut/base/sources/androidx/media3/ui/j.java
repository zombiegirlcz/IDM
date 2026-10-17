package androidx.media3.ui;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7664a;

    public /* synthetic */ j(int i) {
        this.f7664a = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj2) {
        switch (this.f7664a) {
            case 0:
                return SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj2);
            default:
                return SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj2);
        }
    }
}
