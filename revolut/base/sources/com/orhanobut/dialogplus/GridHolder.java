package com.orhanobut.dialogplus;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import y2l.a;

/* JADX INFO: loaded from: classes17.dex */
public class GridHolder implements HolderAdapter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GridView f50240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f50241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f50242c;
    public OnHolderListener d;
    public View.OnKeyListener e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f50243g;

    @Override // com.orhanobut.dialogplus.HolderAdapter
    public final void a(a aVar) {
        this.f50240a.setAdapter((ListAdapter) aVar);
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final View b() {
        return this.f50240a;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void c(View.OnKeyListener onKeyListener) {
        this.e = onKeyListener;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(com.revolut.revolut.feature_fourthline_impl.R.layout.dialog_grid, viewGroup, false);
        viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container).setBackgroundResource(0);
        GridView gridView = (GridView) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_list);
        this.f50240a = gridView;
        gridView.setNumColumns(0);
        this.f50240a.setOnItemClickListener(this);
        this.f50240a.setOnKeyListener(new View.OnKeyListener() { // from class: com.orhanobut.dialogplus.GridHolder.1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                View.OnKeyListener onKeyListener = GridHolder.this.e;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(view, i, keyEvent);
                }
                throw new NullPointerException("keyListener should not be null");
            }
        });
        this.f50241b = (ViewGroup) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_header_container);
        this.f50242c = (ViewGroup) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_footer_container);
        return viewInflate;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void e(View view) {
        if (view == null) {
            return;
        }
        this.f50242c.addView(view);
        this.f50243g = view;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void f(View view) {
        if (view == null) {
            return;
        }
        this.f50241b.addView(view);
        this.f = view;
    }

    @Override // com.orhanobut.dialogplus.HolderAdapter
    public final void g(OnHolderListener onHolderListener) {
        this.d = onHolderListener;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        OnHolderListener onHolderListener = this.d;
        if (onHolderListener == null) {
            return;
        }
        onHolderListener.a(view, i, adapterView.getItemAtPosition(i));
    }
}
