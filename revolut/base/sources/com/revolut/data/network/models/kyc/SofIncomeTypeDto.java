package com.revolut.data.network.models.kyc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/data/network/models/kyc/SofIncomeTypeDto;", "", "type", "", "name", "proofs", "", "Lcom/revolut/data/network/models/kyc/SofIncomeProofDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getName", "getProofs", "()Ljava/util/List;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SofIncomeTypeDto {

    @b("name")
    @NotNull
    private final String name;

    @b("proofs")
    @NotNull
    private final List<SofIncomeProofDto> proofs;

    @b("type")
    @NotNull
    private final String type;

    public SofIncomeTypeDto(@NotNull String type, @NotNull String name, @NotNull List<SofIncomeProofDto> proofs) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(proofs, "proofs");
        this.type = type;
        this.name = name;
        this.proofs = proofs;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<SofIncomeProofDto> getProofs() {
        return this.proofs;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
