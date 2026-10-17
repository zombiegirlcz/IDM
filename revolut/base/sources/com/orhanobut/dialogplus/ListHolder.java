package com.orhanobut.dialogplus;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import y2l.a;

/* JADX INFO: loaded from: classes17.dex */
public class ListHolder implements HolderAdapter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListView f50249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnHolderListener f50250c;
    public View.OnKeyListener d;
    public View e;
    public View f;

    @Override // com.orhanobut.dialogplus.HolderAdapter
    public final void a(a aVar) {
        this.f50249b.setAdapter((ListAdapter) aVar);
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final View b() {
        return this.f50249b;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void c(View.OnKeyListener onKeyListener) {
        this.d = onKeyListener;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(com.revolut.revolut.feature_fourthline_impl.R.layout.dialog_list, viewGroup, false);
        viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_outmost_container).setBackgroundResource(this.f50248a);
        ListView listView = (ListView) viewInflate.findViewById(com.revolut.revolut.feature_fourthline_impl.R.id.dialogplus_list);
        this.f50249b = listView;
        listView.setOnItemClickListener(this);
        this.f50249b.setOnKeyListener(new View.OnKeyListener() { // from class: com.orhanobut.dialogplus.ListHolder.1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                View.OnKeyListener onKeyListener = ListHolder.this.d;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(view, i, keyEvent);
                }
                throw new NullPointerException("keyListener should not be null");
            }
        });
        return viewInflate;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void e(View view) {
        if (view == null) {
            return;
        }
        this.f50249b.addFooterView(view);
        this.f = view;
    }

    @Override // com.orhanobut.dialogplus.Holder
    public final void f(View view) {
        if (view == null) {
            return;
        }
        this.f50249b.addHeaderView(view);
        this.e = view;
    }

    @Override // com.orhanobut.dialogplus.HolderAdapter
    public final void g(OnHolderListener onHolderListener) {
        this.f50250c = onHolderListener;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        OnHolderListener onHolderListener = this.f50250c;
        if (onHolderListener == null) {
            return;
        }
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if (this.e != null) {
            i--;
        }
        onHolderListener.a(view, i, itemAtPosition);
    }
}
