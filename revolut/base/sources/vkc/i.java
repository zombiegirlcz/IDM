package vkc;

import com.revolut.feature.rfi_tool.impl.domain.model.ContentType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289908a;

    static {
        int[] iArr = new int[ContentType.values().length];
        try {
            iArr[ContentType.FORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f289908a = iArr;
    }
}
