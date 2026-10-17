package com.airbnb.lottie;

import a09.r;
import a5h.g;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import d7.a0;
import d7.b0;
import d7.c0;
import d7.d;
import d7.d0;
import d7.e;
import d7.e0;
import d7.f0;
import d7.g0;
import d7.h;
import d7.i;
import d7.i0;
import d7.j;
import d7.j0;
import d7.k;
import d7.k0;
import d7.m0;
import d7.n;
import d7.n0;
import d7.o0;
import d7.t;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import k7.f;
import n7.b;
import s7.c;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f25583r = 0;
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private i0 compositionTask;
    private d0 failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final d0 loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<e0> lottieOnCompositionLoadedListeners;
    private final Set<h> userActionsTaken;
    private final d0 wrappedFailureListener;
    private static final String TAG = "LottieAnimationView";
    private static final d0 DEFAULT_FAILURE_LISTENER = new e();

    /* JADX INFO: loaded from: classes16.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f25586c;
        public boolean d;
        public String e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f25587g;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f25584a);
            parcel.writeFloat(this.f25586c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.f25587g);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new i(this, 1);
        this.wrappedFailureListener = new i(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        d(null, R.attr.lottieAnimationViewStyle);
    }

    public static g0 a(LottieAnimationView lottieAnimationView, String str) {
        if (!lottieAnimationView.cacheComposition) {
            return n.b(lottieAnimationView.getContext(), str, null);
        }
        Context context = lottieAnimationView.getContext();
        HashMap map = n.f111702a;
        return n.b(context, str, "asset_" + str);
    }

    public static g0 b(LottieAnimationView lottieAnimationView, int i) {
        if (!lottieAnimationView.cacheComposition) {
            return n.g(lottieAnimationView.getContext(), i, null);
        }
        Context context = lottieAnimationView.getContext();
        return n.g(context, i, n.m(i, context));
    }

    private void setCompositionTask(i0 i0Var) {
        g0 g0Var = i0Var.d;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (g0Var != null && lottieDrawable == getDrawable() && lottieDrawable.f25588a == g0Var.f111669a) {
            return;
        }
        this.userActionsTaken.add(h.SET_ANIMATION);
        this.lottieDrawable.d();
        c();
        i0Var.b(this.loadedListener);
        i0Var.a(this.wrappedFailureListener);
        this.compositionTask = i0Var;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.f25589b.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.f25589b.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.f25589b.addUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull e0 e0Var) {
        if (getComposition() != null) {
            e0Var.a();
        }
        return this.lottieOnCompositionLoadedListeners.add(e0Var);
    }

    public <T> void addValueCallback(f fVar, T t2, c cVar) {
        this.lottieDrawable.a(fVar, t2, cVar);
    }

    public final void c() {
        i0 i0Var = this.compositionTask;
        if (i0Var != null) {
            d0 d0Var = this.loadedListener;
            synchronized (i0Var) {
                i0Var.f111674a.remove(d0Var);
            }
            i0 i0Var2 = this.compositionTask;
            d0 d0Var2 = this.wrappedFailureListener;
            synchronized (i0Var2) {
                i0Var2.f111675b.remove(d0Var2);
            }
        }
    }

    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(h.PLAY_OPTION);
        LottieDrawable lottieDrawable = this.lottieDrawable;
        lottieDrawable.f25591g.clear();
        lottieDrawable.f25589b.cancel();
        if (lottieDrawable.isVisible()) {
            return;
        }
        lottieDrawable.f = a0.NONE;
    }

    public <T> void clearValueCallback(f fVar, T t2) {
        this.lottieDrawable.a(fVar, t2, null);
    }

    public final void d(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k0.f111694a, i, 0);
        this.cacheComposition = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.autoPlay = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            this.lottieDrawable.f25589b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f = typedArrayObtainStyledAttributes.getFloat(15, BitmapDescriptorFactory.HUE_RED);
        if (zHasValue4) {
            this.userActionsTaken.add(h.SET_PROGRESS);
        }
        this.lottieDrawable.A(f);
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            addValueCallback(new f("**"), f0.I, new c(new n0(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            m0 m0Var = m0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(17, m0Var.ordinal());
            if (iOrdinal >= m0.values().length) {
                iOrdinal = m0Var.ordinal();
            }
            setRenderMode(m0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            d7.a aVar = d7.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(2, aVar.ordinal());
            if (iOrdinal2 >= m0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(d7.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.getClass();
    }

    public void enableFeatureFlag(b0 b0Var, boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        boolean zJ = lottieDrawable.f25596n.j(b0Var, z);
        if (lottieDrawable.f25588a == null || !zJ) {
            return;
        }
        lottieDrawable.c();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        boolean zJ = lottieDrawable.f25596n.j(b0.MergePathsApi19, z);
        if (lottieDrawable.f25588a == null || !zJ) {
            return;
        }
        lottieDrawable.c();
    }

    public d7.a getAsyncUpdates() {
        d7.a aVar = this.lottieDrawable.N;
        return aVar != null ? aVar : d.f111646a;
    }

    public boolean getAsyncUpdatesEnabled() {
        d7.a aVar = this.lottieDrawable.N;
        if (aVar == null) {
            aVar = d.f111646a;
        }
        return aVar == d7.a.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.f25602w;
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.f25597p;
    }

    public j getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.f25588a;
        }
        return null;
    }

    public long getDuration() {
        j composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.lottieDrawable.f25589b.f251940h;
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.o;
    }

    public float getMaxFrame() {
        return this.lottieDrawable.f25589b.b();
    }

    public float getMinFrame() {
        return this.lottieDrawable.f25589b.c();
    }

    public j0 getPerformanceTracker() {
        j jVar = this.lottieDrawable.f25588a;
        if (jVar != null) {
            return jVar.f111677a;
        }
        return null;
    }

    public float getProgress() {
        return this.lottieDrawable.f25589b.a();
    }

    public m0 getRenderMode() {
        return this.lottieDrawable.f25604y ? m0.SOFTWARE : m0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.lottieDrawable.f25589b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.f25589b.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.f25589b.d;
    }

    public boolean hasMasks() {
        n7.d dVar = this.lottieDrawable.f25598q;
        return dVar != null && dVar.q();
    }

    public boolean hasMatte() {
        boolean zBooleanValue;
        n7.d dVar = this.lottieDrawable.f25598q;
        if (dVar == null) {
            return false;
        }
        ArrayList arrayList = dVar.E;
        if (dVar.K == null) {
            if (dVar.f212942s != null) {
                dVar.K = Boolean.TRUE;
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((b) arrayList.get(size)).f212942s != null) {
                        dVar.K = Boolean.TRUE;
                    }
                }
                dVar.K = Boolean.FALSE;
                zBooleanValue = dVar.K.booleanValue();
            }
            zBooleanValue = true;
            break;
        } else {
            zBooleanValue = dVar.K.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof LottieDrawable) {
            if ((((LottieDrawable) drawable).f25604y ? m0.SOFTWARE : m0.HARDWARE) == m0.SOFTWARE) {
                this.lottieDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        r7.e eVar = this.lottieDrawable.f25589b;
        if (eVar == null) {
            return false;
        }
        return eVar.f251943m;
    }

    public boolean isFeatureFlagEnabled(b0 b0Var) {
        return this.lottieDrawable.f25596n.u(b0Var);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        return lottieDrawable.f25596n.u(b0.MergePathsApi19);
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.f25589b.setRepeatCount(z ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.m();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.f25584a;
        Set<h> set = this.userActionsTaken;
        h hVar = h.SET_ANIMATION;
        if (!set.contains(hVar) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.f25585b;
        if (!this.userActionsTaken.contains(hVar) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(h.SET_PROGRESS)) {
            this.lottieDrawable.A(savedState.f25586c);
        }
        if (!this.userActionsTaken.contains(h.PLAY_OPTION) && savedState.d) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(h.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!this.userActionsTaken.contains(h.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f);
        }
        if (this.userActionsTaken.contains(h.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f25587g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25584a = this.animationName;
        savedState.f25585b = this.animationResId;
        savedState.f25586c = this.lottieDrawable.f25589b.a();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (lottieDrawable.isVisible()) {
            z = lottieDrawable.f25589b.f251943m;
        } else {
            a0 a0Var = lottieDrawable.f;
            z = a0Var == a0.PLAY || a0Var == a0.RESUME;
        }
        savedState.d = z;
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        savedState.e = lottieDrawable2.i;
        savedState.f = lottieDrawable2.f25589b.getRepeatMode();
        savedState.f25587g = this.lottieDrawable.f25589b.getRepeatCount();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.l();
    }

    public void playAnimation() {
        this.userActionsTaken.add(h.PLAY_OPTION);
        this.lottieDrawable.m();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.f25589b.removeAllListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        r7.e eVar = lottieDrawable.f25589b;
        eVar.removeAllUpdateListeners();
        eVar.addUpdateListener(lottieDrawable.O);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.f25589b.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.f25589b.removePauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull e0 e0Var) {
        return this.lottieOnCompositionLoadedListeners.remove(e0Var);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.f25589b.removeUpdateListener(animatorUpdateListener);
    }

    public List<f> resolveKeyPath(f fVar) {
        return this.lottieDrawable.o(fVar);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(h.PLAY_OPTION);
        this.lottieDrawable.p();
    }

    public void reverseAnimationSpeed() {
        r7.e eVar = this.lottieDrawable.f25589b;
        eVar.d = -eVar.d;
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(n.a(str, new r(inputStream, str, 20), new a0.a(inputStream, 21)));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? n.h(getContext(), str) : n.a(null, new k(getContext(), 0, str, null), null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.u = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.lottieDrawable.v = z;
    }

    public void setAsyncUpdates(d7.a aVar) {
        this.lottieDrawable.N = aVar;
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (z != lottieDrawable.f25602w) {
            lottieDrawable.f25602w = z;
            lottieDrawable.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (z != lottieDrawable.f25597p) {
            lottieDrawable.f25597p = z;
            n7.d dVar = lottieDrawable.f25598q;
            if (dVar != null) {
                dVar.N = z;
            }
            lottieDrawable.invalidateSelf();
        }
    }

    public void setComposition(@NonNull j jVar) {
        d7.a aVar = d.f111646a;
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean zQ = this.lottieDrawable.q(jVar);
        if (this.autoPlay) {
            this.lottieDrawable.m();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || zQ) {
            if (!zQ) {
                boolean zIsAnimating = isAnimating();
                setImageDrawable(null);
                setImageDrawable(this.lottieDrawable);
                if (zIsAnimating) {
                    this.lottieDrawable.p();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<e0> it8 = this.lottieOnCompositionLoadedListeners.iterator();
            while (it8.hasNext()) {
                it8.next().a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        lottieDrawable.f25594l = str;
        g gVarI = lottieDrawable.i();
        if (gVarI != null) {
            gVarI.E0(str);
        }
    }

    public void setFailureListener(d0 d0Var) {
        this.failureListener = d0Var;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(d7.b bVar) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        lottieDrawable.f25595m = bVar;
        g gVar = lottieDrawable.f25593j;
        if (gVar != null) {
            gVar.F0(bVar);
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (map == lottieDrawable.k) {
            return;
        }
        lottieDrawable.k = map;
        lottieDrawable.invalidateSelf();
    }

    public void setFrame(int i) {
        this.lottieDrawable.r(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.d = z;
    }

    public void setImageAssetDelegate(d7.c cVar) {
        j7.a aVar = this.lottieDrawable.f25592h;
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.i = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.animationResId = 0;
        this.animationName = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.o = z;
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.s(i);
    }

    public void setMaxProgress(float f) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        j jVar = lottieDrawable.f25588a;
        if (jVar == null) {
            lottieDrawable.f25591g.add(new t(lottieDrawable, f, 0));
            return;
        }
        r7.e eVar = lottieDrawable.f25589b;
        eVar.j(eVar.f251941j, r7.g.f(jVar.f111683l, jVar.f111684m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.v(str);
    }

    public void setMinAndMaxProgress(float f, float f4) {
        this.lottieDrawable.x(f, f4);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.y(i);
    }

    public void setMinProgress(float f) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        j jVar = lottieDrawable.f25588a;
        if (jVar == null) {
            lottieDrawable.f25591g.add(new t(lottieDrawable, f, 1));
        } else {
            lottieDrawable.y((int) r7.g.f(jVar.f111683l, jVar.f111684m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (lottieDrawable.f25601t == z) {
            return;
        }
        lottieDrawable.f25601t = z;
        n7.d dVar = lottieDrawable.f25598q;
        if (dVar != null) {
            dVar.o(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        lottieDrawable.f25600s = z;
        j jVar = lottieDrawable.f25588a;
        if (jVar != null) {
            jVar.f111677a.f111688a = z;
        }
    }

    public void setProgress(float f) {
        this.userActionsTaken.add(h.SET_PROGRESS);
        this.lottieDrawable.A(f);
    }

    public void setRenderMode(m0 m0Var) {
        LottieDrawable lottieDrawable = this.lottieDrawable;
        lottieDrawable.f25603x = m0Var;
        lottieDrawable.e();
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(h.SET_REPEAT_COUNT);
        this.lottieDrawable.f25589b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(h.SET_REPEAT_MODE);
        this.lottieDrawable.f25589b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.e = z;
    }

    public void setSpeed(float f) {
        this.lottieDrawable.f25589b.d = f;
    }

    public void setTextDelegate(o0 o0Var) {
        this.lottieDrawable.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.lottieDrawable.f25589b.f251944n = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            boolean r0 = r3.ignoreUnschedule
            r1 = 0
            if (r0 != 0) goto L17
            com.airbnb.lottie.LottieDrawable r2 = r3.lottieDrawable
            if (r4 != r2) goto L17
            r7.e r2 = r2.f25589b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            boolean r2 = r2.f251943m
        L11:
            if (r2 == 0) goto L17
            r3.pauseAnimation()
            goto L2c
        L17:
            if (r0 != 0) goto L2c
            boolean r0 = r4 instanceof com.airbnb.lottie.LottieDrawable
            if (r0 == 0) goto L2c
            r0 = r4
            com.airbnb.lottie.LottieDrawable r0 = (com.airbnb.lottie.LottieDrawable) r0
            r7.e r2 = r0.f25589b
            if (r2 != 0) goto L25
            goto L27
        L25:
            boolean r1 = r2.f251943m
        L27:
            if (r1 == 0) goto L2c
            r0.l()
        L2c:
            super.unscheduleDrawable(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Bitmap bitmapB;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        j7.a aVarJ = lottieDrawable.j();
        if (aVarJ == null) {
            r7.c.b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Map map = aVarJ.f171825c;
        if (bitmap == null) {
            c0 c0Var = (c0) map.get(str);
            bitmapB = c0Var.b();
            c0Var.g(null);
        } else {
            Bitmap bitmapB2 = ((c0) map.get(str)).b();
            aVarJ.a(bitmap, str);
            bitmapB = bitmapB2;
        }
        lottieDrawable.invalidateSelf();
        return bitmapB;
    }

    public <T> void addValueCallback(f fVar, T t2, s7.e eVar) {
        this.lottieDrawable.a(fVar, t2, new d7.g(eVar));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.t(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.w(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.z(str);
    }

    public void setAnimation(final int i) {
        i0 i0VarF;
        this.animationResId = i;
        this.animationName = null;
        if (isInEditMode()) {
            i0VarF = new i0(new Callable() { // from class: d7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.b(this.f111649a, i);
                }
            }, true);
        } else if (this.cacheComposition) {
            Context context = getContext();
            i0VarF = n.f(context, i, n.m(i, context));
        } else {
            i0VarF = n.f(getContext(), i, null);
        }
        setCompositionTask(i0VarF);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.u(i, i2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(n.a(str2, new k(getContext(), 0, str, str2), null));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new i(this, 1);
        this.wrappedFailureListener = new i(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        d(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(String str) {
        i0 i0VarA;
        this.animationName = str;
        this.animationResId = 0;
        int i = 1;
        if (isInEditMode()) {
            i0VarA = new i0(new r(this, str, 19), true);
        } else {
            String str2 = null;
            if (this.cacheComposition) {
                Context context = getContext();
                HashMap map = n.f111702a;
                String strQ = j6.a.q("asset_", str);
                i0VarA = n.a(strQ, new k(context.getApplicationContext(), i, str, strQ), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = n.f111702a;
                i0VarA = n.a(null, new k(context2.getApplicationContext(), i, str, str2), null);
            }
        }
        setCompositionTask(i0VarA);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new i(this, 1);
        this.wrappedFailureListener = new i(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        d(attributeSet, i);
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(n.a(str, new r(zipInputStream, str, 21), new a0.a(zipInputStream, 22)));
    }
}
