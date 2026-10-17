package com.orhanobut.dialogplus;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes17.dex */
class ExpandTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f50235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50237c;
    public boolean d;

    /* JADX INFO: renamed from: com.orhanobut.dialogplus.ExpandTouchListener$1, reason: invalid class name */
    class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
            throw null;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.orhanobut.dialogplus.ExpandTouchListener$2, reason: invalid class name */
    class AnonymousClass2 extends SimpleAnimationListener {
        public AnonymousClass2() {
        }

        @Override // com.orhanobut.dialogplus.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ExpandTouchListener.this.f50236b = true;
        }
    }

    /* JADX INFO: renamed from: com.orhanobut.dialogplus.ExpandTouchListener$3, reason: invalid class name */
    class AnonymousClass3 extends SimpleAnimationListener {
        public AnonymousClass3() {
        }

        @Override // com.orhanobut.dialogplus.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ExpandTouchListener.this.f50236b = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        throw null;
    }
}
