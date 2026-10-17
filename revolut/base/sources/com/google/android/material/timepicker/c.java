package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49164b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f49163a = i;
        this.f49164b = obj2;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        switch (this.f49163a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f49164b).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z);
                break;
            default:
                ((TimePickerView) this.f49164b).lambda$new$0(materialButtonToggleGroup, i, z);
                break;
        }
    }
}
