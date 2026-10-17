package com.fourthline.vision.internal;

import android.util.Size;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.common.InputImage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s9 {

    public static final class a implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f36874a;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f36874a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
        public final /* synthetic */ void onSuccess(Object obj2) {
            this.f36874a.invoke(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size getSize(InputImage inputImage) {
        int i = inputImage.f;
        int i2 = inputImage.e;
        int i3 = inputImage.d;
        return i == 0 ? new Size(i3, i2) : new Size(i2, i3);
    }
}
