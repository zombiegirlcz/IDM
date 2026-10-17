package com.revolut.data.network.models.budgeting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/budgeting/DirectionDto;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "IN", "OUT", "BOTH", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectionDto {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectionDto[] $VALUES;

    @b("NONE")
    public static final DirectionDto NONE = new DirectionDto("NONE", 0);

    @b("IN")
    public static final DirectionDto IN = new DirectionDto("IN", 1);

    @b("OUT")
    public static final DirectionDto OUT = new DirectionDto("OUT", 2);

    @b("BOTH")
    public static final DirectionDto BOTH = new DirectionDto("BOTH", 3);

    private static final /* synthetic */ DirectionDto[] $values() {
        return new DirectionDto[]{NONE, IN, OUT, BOTH};
    }

    static {
        DirectionDto[] directionDtoArr$values = $values();
        $VALUES = directionDtoArr$values;
        $ENTRIES = s.n(directionDtoArr$values);
    }

    private DirectionDto(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DirectionDto valueOf(String str) {
        return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
    }

    public static DirectionDto[] values() {
        return (DirectionDto[]) $VALUES.clone();
    }
}
