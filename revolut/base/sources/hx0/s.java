package hx0;

import android.animation.Animator;
import android.view.View;
import androidx.collection.MutableObjectFloatMap;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f156333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f156334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f156335c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ MutableObjectFloatMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f156336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f156337h;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f156338j;
    public final /* synthetic */ ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableObjectFloatMap f156339l;

    public s(Ref$BooleanRef ref$BooleanRef, View view, float f, ArrayList arrayList, ArrayList arrayList2, MutableObjectFloatMap mutableObjectFloatMap, Ref$BooleanRef ref$BooleanRef2, View view2, float f4, ArrayList arrayList3, ArrayList arrayList4, MutableObjectFloatMap mutableObjectFloatMap2) {
        this.f156333a = ref$BooleanRef;
        this.f156334b = view;
        this.f156335c = f;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = mutableObjectFloatMap;
        this.f156336g = ref$BooleanRef2;
        this.f156337h = view2;
        this.i = f4;
        this.f156338j = arrayList3;
        this.k = arrayList4;
        this.f156339l = mutableObjectFloatMap2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        u.a(this.f156336g, this.f156337h, this.i, this.f156338j, this.k, this.f156339l);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u.a(this.f156333a, this.f156334b, this.f156335c, this.d, this.e, this.f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
