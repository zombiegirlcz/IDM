package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h31 implements fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mi f29129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f29131c;

    public h31(mi repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f29129a = repository;
        this.f29130b = repository.m() == null;
        this.f29131c = c81.a.a(c81.f27404a, R.string.step_document_details_label_number_esp_id, 0, 2, null);
    }

    @Override // com.fourthline.orca.internal.fi
    public l20 a() {
        Date dateM = this.f29129a.m();
        return (dateM == null || !a(dateM)) ? l20.f30507a : l20.d;
    }

    @Override // com.fourthline.orca.internal.fi
    public c81 b() {
        return this.f29131c;
    }

    @Override // com.fourthline.orca.internal.fi
    public gi c() {
        if (!this.f29130b) {
            return null;
        }
        boolean z = false;
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.step_document_details_checkbox_indefinite, 0, 2, null);
        Date dateM = this.f29129a.m();
        if (dateM != null && a(dateM)) {
            z = true;
        }
        return new gi(dVarA, z);
    }

    private final boolean a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1) == 9999 && calendar.get(2) == 0 && calendar.get(5) == 1;
    }
}
