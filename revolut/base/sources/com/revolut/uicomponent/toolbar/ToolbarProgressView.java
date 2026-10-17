package com.revolut.uicomponent.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@d
public class ToolbarProgressView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f107286a;

    public ToolbarProgressView(Context context) {
        this(context, null);
    }

    public ToolbarProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R$layout.uic_toolbar_progress_view, this);
        this.f107286a = (ProgressBar) findViewById(R$id.progress);
    }
}
