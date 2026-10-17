package com.orhanobut.dialogplus;

import ag.p;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import cwl.f;
import od0.h;
import x0i.i;
import y2l.a;

/* JADX INFO: loaded from: classes17.dex */
public class DialogPlus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f50211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f50212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50213c;
    public boolean d;
    public final p e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Holder f50214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f50215h;
    public final Animation i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Animation f50216j;
    public final View.OnTouchListener k = new View.OnTouchListener() { // from class: com.orhanobut.dialogplus.DialogPlus.5
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            DialogPlus dialogPlus = DialogPlus.this;
            i iVar = dialogPlus.f;
            if (iVar != null) {
                iVar.a();
            }
            dialogPlus.b();
            return false;
        }
    };

    public DialogPlus(DialogPlusBuilder dialogPlusBuilder) {
        int[] iArr;
        int i;
        BaseDelegatesActivity baseDelegatesActivity = dialogPlusBuilder.f;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(baseDelegatesActivity);
        if (dialogPlusBuilder.f50227h == null) {
            dialogPlusBuilder.f50227h = new ListHolder();
        }
        this.f50214g = dialogPlusBuilder.f50227h;
        this.e = dialogPlusBuilder.f50228j;
        this.f = dialogPlusBuilder.k;
        this.f50213c = dialogPlusBuilder.f50229l;
        ViewGroup viewGroup = (ViewGroup) baseDelegatesActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        this.f50215h = viewGroup;
        int i2 = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(com.revolut.revolut.feature_fourthline_impl.R.layout.base_container, viewGroup, false);
        this.f50211a = viewGroup2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int[] iArr2 = dialogPlusBuilder.f50225c;
        boolean z = true;
        char c2 = 2;
        layoutParams.setMargins(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        viewGroup2.setLayoutParams(layoutParams);
        viewGroup2.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container).setBackgroundResource(dialogPlusBuilder.f50234r);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_content_container);
        this.f50212b = viewGroup3;
        viewGroup3.setLayoutParams(dialogPlusBuilder.d);
        int i3 = dialogPlusBuilder.f50233q;
        this.i = AnimationUtils.loadAnimation(baseDelegatesActivity, i3 == -1 ? Utils.b(dialogPlusBuilder.i, false) : i3);
        int i5 = dialogPlusBuilder.f50232p;
        this.f50216j = AnimationUtils.loadAnimation(baseDelegatesActivity, i5 == -1 ? Utils.b(dialogPlusBuilder.i, true) : i5);
        int i6 = dialogPlusBuilder.f50231n;
        View viewInflate = dialogPlusBuilder.f50226g;
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(baseDelegatesActivity);
        if (viewInflate == null && i6 != -1) {
            viewInflate = layoutInflaterFrom2.inflate(i6, (ViewGroup) null);
        }
        int i21 = dialogPlusBuilder.o;
        View viewInflate2 = i21 != -1 ? LayoutInflater.from(baseDelegatesActivity).inflate(i21, (ViewGroup) null) : null;
        a aVar = dialogPlusBuilder.e;
        int[] iArr3 = dialogPlusBuilder.f50224b;
        int dimensionPixelSize = baseDelegatesActivity.getResources().getDimensionPixelSize(com.revolut.revolut.feature_fourthline_impl.R.dimen.dialogplus_default_center_margin);
        int i22 = 0;
        while (true) {
            iArr = dialogPlusBuilder.f50223a;
            i = i2;
            if (i22 >= iArr.length) {
                break;
            }
            int i32 = dialogPlusBuilder.i;
            boolean z3 = z;
            int i33 = iArr[i22];
            char c3 = c2;
            if (i32 != 17) {
                if (i33 == -1) {
                    i33 = i;
                }
            } else if (i33 == -1) {
                i33 = dimensionPixelSize;
            }
            iArr[i22] = i33;
            i22++;
            i2 = i;
            z = z3;
            c2 = c3;
        }
        boolean z4 = z;
        char c5 = c2;
        Holder holder = this.f50214g;
        View viewD = holder.d(layoutInflaterFrom, this.f50211a);
        if (holder instanceof ViewHolder) {
            a(viewD);
        }
        a(viewInflate);
        holder.f(viewInflate);
        a(viewInflate2);
        holder.e(viewInflate2);
        if (aVar != null && (holder instanceof HolderAdapter)) {
            HolderAdapter holderAdapter = (HolderAdapter) holder;
            holderAdapter.a(aVar);
            holderAdapter.g(new OnHolderListener() { // from class: com.orhanobut.dialogplus.DialogPlus.2
                @Override // com.orhanobut.dialogplus.OnHolderListener
                public final void a(View view, int i43, Object obj2) {
                    DialogPlus dialogPlus = DialogPlus.this;
                    p pVar = dialogPlus.e;
                    if (pVar == null) {
                        return;
                    }
                    String str = (String) pVar.f4717b;
                    f fVar = (f) pVar.f4718c;
                    String str2 = (String) pVar.d;
                    if (obj2 != null) {
                        if (obj2.equals(str)) {
                            od0.i.Companion.getClass();
                            h.a(fVar).e(new x2l.a(0, false));
                        } else if (obj2.equals(str2)) {
                            od0.i.Companion.getClass();
                            h.a(fVar).e(new x2l.a(1, false));
                        }
                    }
                    dialogPlus.b();
                }
            });
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.setMargins(iArr[i], iArr[z4 ? 1 : 0], iArr[c5], iArr[3]);
        viewD.setLayoutParams(layoutParams2);
        holder.b().setPadding(iArr3[i], iArr3[z4 ? 1 : 0], iArr3[c5], iArr3[3]);
        this.f50212b.addView(viewD);
        if (this.f50213c) {
            this.f50211a.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container).setOnTouchListener(this.k);
        }
    }

    public final void a(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount));
            }
        }
        if (view.getId() == -1 || (view instanceof AdapterView)) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.orhanobut.dialogplus.DialogPlus.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DialogPlus.this.getClass();
            }
        });
    }

    public final void b() {
        if (this.d) {
            return;
        }
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.orhanobut.dialogplus.DialogPlus.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                DialogPlus.this.f50215h.post(new Runnable() { // from class: com.orhanobut.dialogplus.DialogPlus.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogPlus dialogPlus = DialogPlus.this;
                        dialogPlus.f50215h.removeView(dialogPlus.f50211a);
                        dialogPlus.d = false;
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        };
        Animation animation = this.i;
        animation.setAnimationListener(animationListener);
        this.f50212b.startAnimation(animation);
        this.d = true;
    }

    public final void c() {
        ViewGroup viewGroup = this.f50215h;
        if (viewGroup.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container) != null) {
            return;
        }
        viewGroup.addView(this.f50211a);
        Animation animation = this.f50216j;
        ViewGroup viewGroup2 = this.f50212b;
        viewGroup2.startAnimation(animation);
        viewGroup2.requestFocus();
        this.f50214g.c(new View.OnKeyListener() { // from class: com.orhanobut.dialogplus.DialogPlus.4
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 1 || i != 4) {
                    return false;
                }
                DialogPlus dialogPlus = DialogPlus.this;
                if (dialogPlus.f50213c) {
                    i iVar = dialogPlus.f;
                    if (iVar != null) {
                        iVar.a();
                    }
                    dialogPlus.b();
                }
                return true;
            }
        });
    }
}
