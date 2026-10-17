package j01;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f169907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f169908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f169909c;
    public Object d;
    public final View[] e;
    public final float[] f;

    public c(View[] viewsToHighlight, Object data, ihm.f onClickSubject, Function0 function0) {
        Intrinsics.checkNotNullParameter(viewsToHighlight, "viewsToHighlight");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClickSubject, "onClickSubject");
        this.f169907a = onClickSubject;
        this.f169908b = 200L;
        this.f169909c = function0;
        this.d = data;
        this.e = viewsToHighlight;
        int length = viewsToHighlight.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = this.e[i].getAlpha();
        }
        this.f = fArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function0 function0 = this.f169909c;
        if (function0 != null) {
            function0.invoke();
        }
        this.f169907a.onNext(this.d);
        View[] viewArr = this.e;
        int length = viewArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            View view2 = viewArr[i];
            view2.setAlpha(0.3f);
            view2.animate().alpha(this.f[i2]).setDuration(this.f169908b).start();
            i++;
            i2++;
        }
    }

    public /* synthetic */ c(View[] viewArr, Object obj2, ihm.f fVar, Function0 function0, int i) {
        this(viewArr, obj2, fVar, (i & 16) != 0 ? null : function0);
    }
}
