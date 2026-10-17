package com.revolut.core.ui_kit.delegates;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 extends koi.b {
    public final AppCompatTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f55584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f55585h;
    public final AppCompatImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f55586j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r1 f55587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AppCompatImageView f55588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (AppCompatTextView) itemView.findViewById(R$id.calendarRow_dateTitle);
        this.f55584g = (AppCompatTextView) itemView.findViewById(R$id.calendarRow_dateSubtitle);
        this.f55585h = (ConstraintLayout) itemView.findViewById(R$id.calendarRow_container);
        this.i = (AppCompatImageView) itemView.findViewById(R$id.calendarRow_icon);
        this.f55586j = (AppCompatTextView) itemView.findViewById(R$id.calendarRow_title);
        this.k = (AppCompatTextView) itemView.findViewById(R$id.calendarRow_subtitle);
    }
}
