package com.orhanobut.dialogplus;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes17.dex */
public class ViewHolder implements Holder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f50252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f50253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f50254c;
    public View d;
    public View.OnKeyListener e;
    public View f;

    @Override // com.orhanobut.dialogplus.Holder
    public final View b() {
        return this.f;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void c(View.OnKeyListener onKeyListener) {
        this.e = onKeyListener;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(com.revolut.revolut.feature_fourthline_impl.R.layout.dialog_view, viewGroup, false);
        viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container).setBackgroundResource(0);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_view_container);
        viewGroup2.setOnKeyListener(new View.OnKeyListener() { // from class: com.orhanobut.dialogplus.ViewHolder.1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                View.OnKeyListener onKeyListener = ViewHolder.this.e;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(view, i, keyEvent);
                }
                throw new NullPointerException("keyListener should not be null");
            }
        });
        View viewInflate2 = layoutInflater.inflate(0, viewGroup, false);
        this.f = viewInflate2;
        viewGroup2.addView(viewInflate2);
        this.f50252a = (ViewGroup) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_header_container);
        this.f50254c = (ViewGroup) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_footer_container);
        return viewInflate;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void e(View view) {
        if (view == null) {
            return;
        }
        this.f50254c.addView(view);
        this.d = view;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void f(View view) {
        if (view == null) {
            return;
        }
        this.f50252a.addView(view);
        this.f50253b = view;
    }
}
